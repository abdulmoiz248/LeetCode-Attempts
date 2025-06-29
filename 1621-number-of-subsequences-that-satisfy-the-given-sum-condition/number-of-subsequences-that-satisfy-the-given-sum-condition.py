class Solution(object):
    def numSubseq(self, nums, target):
        mod = 10**9 + 7
        nums.sort()
        n = len(nums)
        
        # calculating all possible sub seq
        powers = [1] * n
        for i in range(1, n):
            powers[i] = (powers[i - 1] * 2) % mod

        i = 0
        j = n - 1
        ans = 0

        while i <= j:
            if nums[i] + nums[j] <= target:
                ans = (ans + powers[j - i]) % mod
                i += 1
            else:
                j -= 1

        return ans
