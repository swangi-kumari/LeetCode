class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = n-1;
        while(start<end){
            int min = Math.min(height[start], height[end]);
            max=Math.max(max, min*(end-start));   
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }      
        }   
        return max;
    }
}