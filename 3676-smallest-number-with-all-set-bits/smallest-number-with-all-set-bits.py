class Solution(object):
    def smallestNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        for i in range(1,n):
          
            if 2**i>n:
                
                return (2**i)-1
        return n