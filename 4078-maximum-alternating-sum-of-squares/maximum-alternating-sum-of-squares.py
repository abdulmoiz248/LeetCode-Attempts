class Solution(object):
    def maxAlternatingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums = sorted(x * x for x in nums)
        return abs(sum(nums[:len(nums)//2]) - sum(nums[len(nums)//2:]))