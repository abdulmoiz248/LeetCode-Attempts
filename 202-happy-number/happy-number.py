class Solution(object):
    def __init__(self):
        self.seen = set()
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
       
        if n==1: return True
        if n==10: return True
        if  n in self.seen: return False
        self.seen.add(n)
        n=str(n)
        sum=0
        for i in n:
            sum+=int(i)**2
        return self.isHappy(sum) 
           
          

        