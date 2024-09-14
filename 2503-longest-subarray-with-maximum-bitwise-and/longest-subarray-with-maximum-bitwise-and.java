class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,ans=0,curr=0;
        for(int n:nums){
            if(max<n){
                max=n;
                ans=curr=0;
            }

            if(max==n) curr++;
            else curr=0;
            ans=Math.max(curr,ans);

        }
        return ans;
    }
}