class Solution(object):
    def minimumCost(self, nums):
        rest = sorted(nums[1:])
        return nums[0] + rest[0] + rest[1]
