class Solution(object):
    def repeatedNTimes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        arr=[]
        for i in nums:
            if i in arr: return i
            arr.append(i)
        return -1
        