class Solution {
    public boolean isPowerOfThree(int n) {
        long ans = 1;
        while(ans<n){
            ans = ans * 3;
        }
        return ans == n;
    }
}
