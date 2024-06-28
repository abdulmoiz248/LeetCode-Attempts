class Solution(object):
    @staticmethod
    def is_greater_than_32bit_signed(n):
        if n < -2147483648 or n > 2147483647:
            return True
        return False

    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if self.is_greater_than_32bit_signed(x):
            return 0
        
        if x >= 0:
            string = str(x)
            n = int(string[::-1])
            if self.is_greater_than_32bit_signed(n):
                return 0
            return n
        else:
            x = x * -1
            string = str(x)
            n = int(string[::-1])
            if self.is_greater_than_32bit_signed(n):
                return 0
            return -n