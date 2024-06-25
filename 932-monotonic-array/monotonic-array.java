class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean inc2=true;
      for(int i=0;i<nums.length-1;i++){
        if(!(nums[i]<=nums[i+1]))
                inc=false;
      }   
      for(int i=nums.length-1;i>0;i--){
         if(!(nums[i]<=nums[i-1]))
                inc2=false;
      } 
       return inc || inc2;  
      }
     
    }
