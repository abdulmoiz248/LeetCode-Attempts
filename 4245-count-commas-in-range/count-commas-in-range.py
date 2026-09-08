class Solution(object):
    def countCommas(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < 1000: return 0

        return abs(1000 - n) + 1
        