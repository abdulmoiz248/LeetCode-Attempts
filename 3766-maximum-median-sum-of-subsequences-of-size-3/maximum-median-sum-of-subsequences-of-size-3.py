class Solution(object):
    def maximumMedianSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()

        j = len(nums) - 2
        ans = 0

        while j >= len(nums) // 3:
            ans += nums[j]
            j -= 2

        return ans