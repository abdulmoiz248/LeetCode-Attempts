class Solution {
    public int[] buildArray(int[] nums) {
      int left=0;
      int right=nums.length-1;
      int ans[]=new int[right+1];

while(left<=right){

    ans[left]=nums[nums[left]] ;
    ans[right]=nums[nums[right]];
     
    left++;
    right--;
}
      return ans;
    }
}