class Solution(object):
    def maximumDifference(self, nums):
        minVal = nums[0]
        diff = -1
        for i in range(1, len(nums)):
            if nums[i] > minVal:
                diff = max(diff, nums[i] - minVal)
            else:
                minVal = nums[i]
        return diff
