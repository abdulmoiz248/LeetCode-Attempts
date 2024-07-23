class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) 
            return nums[0];

        int element=0; 
        for(int i=0;i<nums.length;i++){
          element^=nums[i];
        } 
        return element;

    }
}