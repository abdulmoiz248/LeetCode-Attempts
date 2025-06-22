class Solution(object):
    def divideString(self, s, k, fill):
        """
        :type s: str
        :type k: int
        :type fill: str
        :rtype: List[str]
        """
        ans=[]
        size=len(s)
        extra=size%k
        for i in range(0,size-extra,k):
            ans.append(s[i:i+k])
        
        
        if extra != 0:
            lastChunk = s[size - extra:]
            padding = fill * (k-extra)
            ans.append(lastChunk + padding)
        return ans


        