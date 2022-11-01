/**
1748. Sum of Unique Elements
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
**/

class Solution {
    public int sumOfUnique(int[] nums) {
        
        Arrays.sort(nums);
        int sum = 0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]) {  //for index 1 element
            sum+=nums[0];
        }
        for(int i = 1; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                sum+=nums[i];
            }
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){   //for last index element
            sum+=nums[nums.length-1];
        }
        return sum;
    }
}
