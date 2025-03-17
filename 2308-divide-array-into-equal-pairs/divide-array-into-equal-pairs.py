class Solution(object):
    def divideArray(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        dic={}
        for i in nums:
            dic[i]=dic.get(i,0)+1
        
        #if len(dic)!=len(nums)/2: return False
        for i in dic:
            if dic[i]%2!=0:
                return False
        return True
        