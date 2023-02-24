//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static void dfs(int node, ArrayList<ArrayList<Integer>> adj , int[] vis){
        vis[node] = 1;
        for(Integer i : adj.get(node)){
            if(vis[i] == 0){
                dfs(i, adj, vis);
            }
        }
    }
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        //convert adj matrix in adj list
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        for(int i = 0; i<V; i++){
            li.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i< V; i++){
            for(int j = 0; j< V; j++){
                if(adj.get(i).get(j) == 1 &&  i!=j){
                    li.get(i).add(j);
                    li.get(j).add(i);
                }
            }
        }
        int vis[] = new int[V];
        int count = 0; 
        for(int i = 0; i< V; i++){
            if(vis[i] == 0){
                count++;
                dfs(i, li, vis); 
            }
        }
        return count;
    }
};
