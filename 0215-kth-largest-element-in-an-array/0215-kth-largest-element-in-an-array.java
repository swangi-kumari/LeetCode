class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Method 1
        // int n = nums.length;
        // Arrays.sort(nums);
        // return nums[n-k];
        
        //Method 2
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            minHeap.add(i);
            // System.out.println(minHeap);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}