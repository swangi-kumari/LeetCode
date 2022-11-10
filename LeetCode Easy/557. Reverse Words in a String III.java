/**
557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
**/

class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int start = 0 ;
        int i = 0;
        
        for(; i<s.length(); i++){
            if(s.charAt(i)==' '){
                int end = i-1;
                String reverse = "";
                for(int j = start; j<=end ; j++){
                    reverse = s.charAt(j) + reverse;
                }
                ans+=reverse + " ";
                start = i+1;
            }
        }
//         
        int end = i-1;
        String reverse = "";
        for(int j = start; j<=end ; j++){
            reverse = s.charAt(j) + reverse;
        }
        ans+=reverse + "";
        return ans;
    }
}


