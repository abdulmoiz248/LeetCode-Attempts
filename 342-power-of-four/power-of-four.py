class Solution(object):
    def isPowerOfFour(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n <= 0:
            return False
        g = math.log(n, 4)
        return abs(g - round(g)) < 1e-10