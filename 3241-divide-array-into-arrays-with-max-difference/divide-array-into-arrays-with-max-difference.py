class Solution(object):
    def divideArray(self, nums, k):
        nums.sort()
        n = len(nums)
        if n % 3 != 0:
            return []

        res = []
        for i in range(0, n, 3):
            group = nums[i:i+3]
            if max(group) - min(group)> k:
                return []
            res.append(group)
        return res
