class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        str1=str(x)
        s=str1[::-1]
        if(s==str1):
            return True
        return False            
        