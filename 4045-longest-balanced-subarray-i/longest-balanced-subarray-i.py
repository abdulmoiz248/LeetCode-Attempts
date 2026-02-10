class Solution(object):
    def longestBalanced(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        size = len(nums)
        ans = 0
        for i in range(size):
            odd = set()
            even = set()
            for j in range(i, size):
                if nums[j] % 2 == 0:
                    even.add(nums[j])
                else:
                    odd.add(nums[j])
                if len(even) == len(odd):
                    ans = max(ans, j - i + 1)
        return ans
