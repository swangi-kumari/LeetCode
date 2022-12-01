class Solution {
    //Approach 2  (Using Sliding Window)
        //time Complexity O(n)
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    
    public int atMostK(int[] nums, int K) {
        int n = nums.length;
        int i = 0, count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int j = 0; j < n; ++j) {
            if (mp.getOrDefault(nums[j], 0) == 0){
                K--;   
            } 
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            
            while (K < 0) {
                mp.put(nums[i], mp.get(nums[i]) - 1);
                if (mp.get(nums[i]) == 0) {
                    K++;
                }
                i++;
            }
            
            count += j - i + 1;
        }
        return count;
    }     
}



 //Brute Force Approach //time Complexity (n^2)
        //Passed only 40/55 test cases
        // int count = 0;
        // for(int i= 0; i<n ;i++){       
        //     Set<Integer> set = new HashSet<>();
        //     set.add(nums[i]);
        //     if(set.size()==k){
        //         count++;
        //     }
        //     for(int j= i+1; j<n ;j++){
        //         set.add(nums[j]);
        //         if(set.size()==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;