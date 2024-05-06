class Solution {
     public int removeElement(int[] nums, int val) {
     if(nums.length==1 && nums[0]==val) return 0;
     int total=nums.length;
     for(int i=0;i<nums.length;i++){
         if(i==total){
             return total;
         }
         if(nums[i]==val){
             if(nums[total-1]==val){
                 total--;
                 i=i-1;
                 continue;
             }
             total--;
             nums[i]=nums[total];
         }
     }
     return total;
    }
}