class Solution(object):
    def longestSubsequence(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        binaryStr = ''
        for i in range(len(s) - 1, -1, -1):
            temp = s[i] + binaryStr
            num = int(temp, 2)
            if num <= k:
                binaryStr = temp
            elif s[i] == '0':
                binaryStr = '0' + binaryStr



        return len(binaryStr)
