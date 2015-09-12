class ClimbingStair{

/*
	public static int climbStair(int n){ // Space O(n)
		if (n == 0 || n == 1 || n ==2) return n;
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i < n+1; n++){
			dp[i]= dp[i-1] + dp [i-2];
		}
		return dp[n];
	}

*/
	public static int climbStair(int n){ //Space O(1)
		if (n == 0 || n == 1) return 1;
		int stepOne = 1;
		int stepTwo = 1;
		int result = 0;
		for ( int i = 2; i <= n ; i++) {
			result = stepOne + stepTwo;
			stepTwo = stepOne;
			stepOne = result;
		}
		return result;
}