class Solution(object):
    def checkDivisibility(self, n):
        """
        :type n: int
        :rtype: bool
        """
        num = str(n)
        sumz = 0
        prd = 1


        for i in num:
            sumz += int(i)
            prd *= int(i)
        print(sumz,prd)
        return n % (sumz + prd) == 0        