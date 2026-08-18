class Solution(object):
    def largestInteger(self, nums, k):
        n = len(nums)

        if k == 1:
            freq = {}
            for num in nums:
                freq[num] = freq.get(num, 0) + 1

            result = -1
            for num in freq:
                if freq[num] == 1:
                    result = max(result, num)

            return result

        if k == n:
            return max(nums)

        freq = {}

        for i in range(n - k + 1):
            window = set(nums[i:i + k])

            for num in window:
                freq[num] = freq.get(num, 0) + 1

        result = -1

        for num in freq:
            if freq[num] == 1:
                result = max(result, num)

        return result