class Solution {
    public int minSwaps(int[] nums) {
     int total1=0;
     for(int n:nums)
         total1+=n;
     if(total1==0 || total1==nums.length) return 0; 
     int window=0;       
     for(int i=0;i<total1;i++)
         window+=nums[i];

     int max=window;
     for(int i=0;i<nums.length;i++){
        window-=nums[i];
        window+=nums[(i+total1)%nums.length];
        max=Math.max(max,window);
     }    

     return (total1-max);
    }
}