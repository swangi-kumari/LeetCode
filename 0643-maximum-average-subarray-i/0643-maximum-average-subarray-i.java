class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;
        double sum = 0;
        for(int i = 0; i< k; i++){
            sum+=nums[i];
        }
        double avg = sum/k;
        ans = Math.max(ans, avg);
        for(int i = k ; i< nums.length ;i++){
            sum = sum + nums[i] - nums[i-k];
            avg = sum/k;
            ans = Math.max(ans, avg);
        }
        return ans;
    }
}