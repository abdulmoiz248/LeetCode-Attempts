class Solution(object):
    def findLHS(self, nums):
        nums.sort()
        left = 0
        maxLen = 0
        for right in range(len(nums)):
            while nums[right] - nums[left] > 1:
                left += 1
            if nums[right] - nums[left] == 1:
                maxLen = max(maxLen, right - left + 1)
        return maxLen
