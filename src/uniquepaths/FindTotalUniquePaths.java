package uniquepaths;

public class FindTotalUniquePaths {
    public int uniquePaths(int m, int n) {
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
