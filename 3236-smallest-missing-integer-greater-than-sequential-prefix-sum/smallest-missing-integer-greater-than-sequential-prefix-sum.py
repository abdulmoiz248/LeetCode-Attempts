class Solution(object):
    def missingInteger(self, nums):
        num = nums[0]

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1] + 1:
                num += nums[i]
            else:
                break

        while num in nums:
            num += 1

        return num