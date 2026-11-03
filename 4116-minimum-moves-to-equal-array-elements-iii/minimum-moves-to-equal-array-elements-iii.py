class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maximum = max(nums)
        ans = 0

        for i in nums:
            ans+= abs(i - maximum)

        return ans

        