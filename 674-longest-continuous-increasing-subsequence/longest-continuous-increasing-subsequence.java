class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int finalSeq=0;
        int currSeq=1;
        for(int i=0;i<nums.length-1;i++){
             if(nums[i]<nums[i+1]){
                currSeq++;
             }else{
                finalSeq=Math.max(finalSeq,currSeq);
                currSeq=1;
             }
        }
        return Math.max(finalSeq,currSeq);
    }
}