class Solution(object):
    def sumAndMultiply(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 0: return 0
        new_num = ''
        sumz = 0
        for i in str(n):
            if i != '0':
                new_num +=i
                sumz += int(i)
        return int(new_num) * sumz
