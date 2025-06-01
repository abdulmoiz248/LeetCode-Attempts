import numpy as np
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        m=len(nums1)
        n=len(nums2)
        one=0
        two=0
        arr=[]
        while one<m and two <n:
            if nums1[one]<nums2[two]:
                arr.append(nums1[one])
                one+=1
            else:
                arr.append(nums2[two])
                two+=1
        if one==m:
            while two<n:
                arr.append(nums2[two])
                two+=1
        else:
            while one<m:
                arr.append(nums1[one])
                one+=1
        return np.median(arr)



