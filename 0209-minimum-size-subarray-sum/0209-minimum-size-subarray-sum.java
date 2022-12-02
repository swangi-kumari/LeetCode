class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            
            while(sum>=target){
                ans = Math.min(ans, i + 1 - start);
                sum -= nums[start]; //decrementing ======
                start++;
            }
        }
        // return the ans
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        else{
            return 0;
        }
        
    }
}