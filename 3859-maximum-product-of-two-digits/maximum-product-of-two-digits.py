class Solution(object):
    def maxProduct(self, n):
        """
        :type n: int
        :rtype: int
        """
        n = str(n)
        num1 = int(n[0])
        ans = 0

        for i in n[1:]:
            if ans < num1 * int(i):
                ans = num1 * int(i)
            if num1 < int(i):
                num1 = int(i)

        return ans
        