class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        dic={}
        ans=-1
        for i in arr:
            dic[i]=dic.get(i,0)+1
        for i in dic:
            if i ==dic[i]:
                ans=max(ans,i)
        return ans
  
        