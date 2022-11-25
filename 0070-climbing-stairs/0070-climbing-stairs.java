class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        return fib(n,dp);
    }
    
    //helper function
    public int fib(int n , int dp[]){
        if(n<=1){
            return dp[n] =1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fib(n-1, dp) + fib(n-2,dp);
        return dp[n];
    }
}