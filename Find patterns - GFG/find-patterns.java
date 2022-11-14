//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String s, String w){
        // code here
        boolean [] vis = new boolean[s.length()];
        int ans= 0;
        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i)==w.charAt(0)) && !vis[i]){
                vis[i]=true;
                int j = i+1; //index for s
                int k = 1;  //index for w
                while(j<s.length() && k<w.length() ){
                    if((s.charAt(j)==w.charAt(k)) && !vis[j]){
                        vis[j]=true;
                        k++;
                    }
                    j++;
                }
                if(k==w.length()){
                    ans++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}