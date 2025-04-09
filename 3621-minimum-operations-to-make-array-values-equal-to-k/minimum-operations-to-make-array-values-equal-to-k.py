class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        map=set()
        for i in nums:
            if i < k:
                return -1
            elif i>k : map.add(i)
            
        return len(map)
        