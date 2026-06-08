class Solution(object):
    def pivotArray(self, nums, pivot):
        """
        :type nums: List[int]
        :type pivot: int
        :rtype: List[int]
        """
        small = []
        large = []
        pivotArr = []
        for i in nums:
            if i == pivot:
                pivotArr.append(i)
            elif i >  pivot:
                large.append(i)
            else: 
                small.append(i)
        return small + pivotArr + large