class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        int start = 0;
        int end = n;
        for(int i = 0; i< arr.length; i=i+2){
            arr[i] = nums[start];
            arr[i+1] = nums[end];
            start++;
            end++;
        }
        return arr;
    }
}