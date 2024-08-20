class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        full=set(range(1,len(nums)+1))
        num=set(nums)
        return list(full-num)      