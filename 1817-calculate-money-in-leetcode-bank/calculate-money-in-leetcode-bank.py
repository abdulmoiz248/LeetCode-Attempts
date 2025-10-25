class Solution(object):
    def totalMoney(self, n):
        """
        :type n: int
        :rtype: int
        """
        ans = 0
        for i in range(n):
            ans += (i // 7) + (i % 7) + 1
        return ans
    



        return ans
        