class Solution(object):
    def leftRightDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        size = len(nums)

        left = [0] * size
        right = [0] * size

        for i in range(size):
            if i != 0:
                left[i] = left[i - 1] + nums[i - 1]

            if i != size - 1:
                right[size - i - 2] = right[size - i - 1] + nums[size - i - 1]

        return [abs(left[i] - right[i]) for i in range(size)]