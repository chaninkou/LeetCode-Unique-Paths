package leetcode62;

public class Main {
	public static void main(String[] args) {
		int m = 3;
		int n = 2;
		
		System.out.println("m: " + m + " n: " + n);
		
		FindTotalUniquePaths solution = new FindTotalUniquePaths();
		
		System.out.println("Numbers of unique paths: " + solution.uniquePaths(m, n));
	}
}
