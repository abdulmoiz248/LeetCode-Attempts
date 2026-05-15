class Solution(object):
    def isGood(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        base  = max(nums)

        if len(nums) != base+1: return False 

        arr = set()
        seen_base = False

        for i in nums:
            if i in arr and i != base:
                 return False
            elif i in arr and i == base:
                if seen_base: return False
                seen_base = True
            arr.add(i)
        return True
