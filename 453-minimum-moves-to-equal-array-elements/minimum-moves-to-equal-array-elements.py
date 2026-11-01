class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        minimum_num = min(nums)
        ans = 0

        for i in nums:
            ans += i - minimum_num
        
        return ans