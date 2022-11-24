class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
    // int sum = 0;
    //     int a = 0;
    //     int b = 1;
    //     int c = 1;
    //     for(int i = 2; i < n ; i++){   
    //         sum = a + b + c;
    //         a = b;
    //         b = c;
    //         c = sum;
    //     }
    //     return sum;
        
         int storage[] = new int[n+1];
        storage[0] =0;
        storage[1] =1;
        storage[2] =1;
        for(int i = 3; i<=n; i++){
            storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
        }
        return storage[n];
    }
}