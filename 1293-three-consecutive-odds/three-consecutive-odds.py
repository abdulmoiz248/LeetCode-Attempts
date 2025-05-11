class Solution(object):
    def threeConsecutiveOdds(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        size=len(arr)
        if size<3: return False
        if size==3:
            return arr[0]%2!=0 and arr[1]%2!=0 and arr[2]%2!=0
        
        for i in range(size-2):
            if arr[i]%2!=0 and arr[i+1]%2!=0 and arr[i+2]%2!=0: return True
        return False
        