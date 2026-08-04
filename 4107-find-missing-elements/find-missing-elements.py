class Solution(object):
    def findMissingElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        arr = []
        for i in range(min(nums),max(nums)):
            if i not in nums:
                arr.append(i)
        return arr
             
        