class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid+1]){
                //decreasing part of array  // maybe ans, but look at left
                end = mid;
            } else {
                start = mid +1; //because we know that mid + 1 element > mid element
            }
        }
        //in end, start== end & pointing to the largest no. because of the 2 checks
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is max
        return start;
    }
}
