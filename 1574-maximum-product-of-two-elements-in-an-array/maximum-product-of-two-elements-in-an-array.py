class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 0 
        n = len(nums)

        for i in range(0,n-1):
            for j in range(i+1,n):
                ans = max(ans,(nums[i]-1)*(nums[j]-1))
        return ans
        