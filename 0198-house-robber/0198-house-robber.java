class Solution {
    public int rob(int[] nums) {
       int n = nums.length;
        int dp[]=new int[n+2];
        
        for(int i = n-1; i >= 0; i--){
            int a = nums[i] + dp[i+2];
            int b = dp[i+1];
            dp[i] = Math.max(a,b);
        }
        return dp[0];
    }
}
