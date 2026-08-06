class Solution(object):
    def smallestNumber(self, n, t):
        """
        :type n: int
        :type t: int
        :rtype: int
        """
        while True:
            str_num = str(n)
            prd = 1
            for i in str_num:
                prd*=int(i)
            if prd % t == 0:
                return n
            n+=1
        
