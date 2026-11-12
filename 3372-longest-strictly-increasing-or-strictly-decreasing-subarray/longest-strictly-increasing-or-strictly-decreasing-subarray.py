class Solution(object):
    def longestMonotonicSubarray(self, nums):
        ans = 1
        inc = 1

        for i in range(len(nums) - 1):
            if nums[i] < nums[i + 1]:
                inc += 1
            else:
                ans = max(inc, ans)
                inc = 1

        ans = max(inc, ans)

        inc = 1
        for i in range(len(nums) - 1):
            if nums[i] > nums[i + 1]:
                inc += 1
            else:
                ans = max(inc, ans)
                inc = 1

        ans = max(inc, ans)

        return ans