class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if (n==1) return 1;
        int prev=0;
        int curr=1;
        for(int i=2;i<n+1;i++){
            int temp=curr;
            curr=curr+prev;
            prev=temp;
        }
        return curr;
        
    }
}