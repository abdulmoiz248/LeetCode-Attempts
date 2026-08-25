class Solution(object):
    def missingMultiple(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums = set(nums)
        i = 1 
        while True:
            if i * k not in nums: return i*k 
            i+=1