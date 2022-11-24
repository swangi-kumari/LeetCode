//{ Driver Code Starts
//Initial Template for C++

#include <iostream>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
   long long nck(long long n, long long k){
        if(n == 0 || n < k) return 0;
            long long res = 1;
            if (k > n - k)
                k = n - k;
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    
    long long count(long long x) {
        // Code Here
        long long r = 0;
        int countB = 0;
    for(int i = 0; i < 64;++i){
        if(x & 1){
            countB++;
            long long nck_r = nck(i,countB);
            r += nck_r;
        }
        x = x >> 1;
    }
    return r;
    }
};

//{ Driver Code Starts.

int main() {
    
	int t;
	cin >> t;
	while (t-- > 0) {
	    long long x; cin >> x;
	    Solution ob;
	    cout << ob.count(x) << '\n';
	}
	return 0;
}
// } Driver Code Ends