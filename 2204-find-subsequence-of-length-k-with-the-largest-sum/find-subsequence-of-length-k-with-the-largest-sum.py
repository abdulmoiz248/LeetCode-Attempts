class Solution(object):
    def maxSubsequence(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        kElements = sorted([(val, idx) for idx, val in enumerate(nums)], reverse=True)[:k]
        kElements.sort(key=lambda x: x[1])
        return [val for val, _ in kElements]
