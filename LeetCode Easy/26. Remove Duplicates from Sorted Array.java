

class Solution {
    public int removeDuplicates(int[] num) {
         if (num.length == 0 || num.length == 1) {
            return num.length;
        }
        int count = 0;
        int j = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {
                num[j++]=num[i];
                count++;
            }
        }
        num[j++]=num[num.length-1];
        return j;
    }
}
