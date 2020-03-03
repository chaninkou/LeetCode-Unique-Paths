package uniquepaths;

public class FindTotalUniquePaths {
	// Dp way, but 2D array this time
	// Basically check the maximum path per block to the end
	public int uniquePaths(int m, int n){
		int[][] dp = new int[m][n];
		
		// Fill the top part with all 1's
		for(int j = 0; j < n; j++){
			dp[0][j] = 1;
		}
		
		// Fill the left part with all 1's
		for(int i = 0; i < m; i++){
			dp[i][0] = 1;
		}
		
		// No point of starting from 0, already fill those with 1
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				// {1,1,1}
				// {1,2,3}
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}
		
		// Get the end element
		return dp[m - 1][n - 1];
	}
	
    public int uniquePaths2(int m, int n) {
        // Total number of steps to goal
        int N = n + m - 2;
        
        // Numbers of ways to go down
        int k = m - 1;
        
        double totalWays = 1;
        
        for(int i = 1; i <= k; i++){
        	// formula
        	// totals = ( (n - k + 1) * (n - k + 2) * ... * n ) / k!
            totalWays = totalWays * (N - k + i) / i;
        }
        
        return (int) totalWays;
    }
}
