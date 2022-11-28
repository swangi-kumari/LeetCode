class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<Double> set = new HashSet<Double>();
        int start = 0;
        int end = n-1;
        while(start<=end){
            double avg = (nums[start]+nums[end])/2.0;
            set.add(avg);
            start++;
            end--;
        }
        
        return set.size();
        
    }
        
}