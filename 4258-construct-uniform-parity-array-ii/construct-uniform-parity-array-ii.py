class Solution(object):
    def uniformArray(self, nums1):
        """
        :type nums1: List[int]
        :rtype: bool
        """

        minOdd = float('inf')

        for i in nums1:
            if i % 2 != 0:
                minOdd = min(minOdd,i)
            
        if minOdd == float('inf'): return True

        for i in nums1:
            if i % 2 == 0:
                if i < minOdd: return False
        
        return True
        




