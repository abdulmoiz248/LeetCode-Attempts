class Solution(object):
    def getLucky(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        alpha = {chr(i): i - 96 for i in range(97, 123)}
        num=""
        for ch in s:
            num+=str(alpha[ch])
        sum=0    
        while k>0:
            sum=0
            for i in num:
                sum+=int(i)
            k=k-1
            num=str(sum)
            
        return sum
        