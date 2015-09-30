/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

Start	0	0	0	0

0 		0	0	0	0

0		0	0	0	End


*/

public class Solution {
    public static int uniquePaths(int m, int n) {
		if (m==0 || n==0) return 0;
		if (m ==1 || n == 1) return 1;

		int[][] dp = new int[m][n];

		// only one row
		for (int i = 0; i< n; i++){
			dp[0][i] =1;
		}


		// only one column
		for (int i = 0; i < m; i++){
			dp[i][0] =1;
		}

		//number of path = paths from top + paths from left
		for (int i =1; i< m; i++){
			for (int j = 1; j < n ; j++ ){
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
	}
}