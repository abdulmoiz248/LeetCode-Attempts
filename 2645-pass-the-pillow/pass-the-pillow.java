class Solution {
    public int passThePillow(int n, int time) {
       if(time==n) return time-1;
       if(time<n) return time+1;
       if((time/(n-1))%2==0){
           return time % (n - 1) + 1;
       } else{
         return n - time % (n - 1);
       }
        
           
    }
}