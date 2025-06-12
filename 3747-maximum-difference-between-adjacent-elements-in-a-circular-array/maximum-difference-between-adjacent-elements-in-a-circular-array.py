class Solution(object):
    def maxAdjacentDistance(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans=0
        size=len(nums)-1
        for i in range(size):
            ans=max(ans,abs(nums[i]-nums[i+1]))
        return max(ans,abs(nums[0]-nums[size]))



        