class Solution(object):
    def countSymmetricIntegers(self, low, high):
        """
        :type low: int
        :type high: int
        :rtype: int
        """
        ans=0
        for i in range(low,high+1):
            string=str(i)
            if len(string)%2!=0: continue 
            first=0
            for j in range(0,len(string)/2):
                first+=int(string[j])
            sec=0
            for j in range(len(string)/2,len(string)):
                sec+=int(string[j])
            if first==sec: ans+=1
        return ans
