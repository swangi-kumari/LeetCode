class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // for(int i = 2; i<n; i++){
        //     cost[i] += Math.min(cost[i-1], cost[i-2]);
        // }
        // return Math.min(cost[n-1], cost[n-2]);
        
        int [] dp = new int[n+1]; 
        for (int i = 2; i <= n; i++) {
            int OneStep = dp[i - 1] + cost[i - 1];  
            int TwoStep = dp[i - 2] + cost[i - 2];  
            dp[i] = Math.min(OneStep, TwoStep);
        }
        return dp[n];
    }
}