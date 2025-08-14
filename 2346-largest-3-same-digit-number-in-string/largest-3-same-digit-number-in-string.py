class Solution(object):
    def largestGoodInteger(self, num):
        """
        :type num: str
        :rtype: str
        """
        largest=0
        found=False
        for i in range(len(num)-2):
            if num[i]==num[i+1] and num[i+1]== num[i+2]:
                if largest<num[i]:
                 largest=num[i]
                 found=True
        if found:
            return largest*3
        return ""

        