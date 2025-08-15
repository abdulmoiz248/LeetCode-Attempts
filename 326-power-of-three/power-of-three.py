class Solution(object):
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n <= 0:
            return False
        g = math.log(n, 3)
        return abs(g - round(g)) < 1e-10
        
        