class Solution(object):
    def minMaxDifference(self, num):
        """
        :type num: int
        :rtype: int
        """
        s = str(num)

        digitToReplaceMax = None
        for ch in s:
            if ch != '9':
                digitToReplaceMax = ch
                break
        maxStr = s.replace(digitToReplaceMax, '9') if digitToReplaceMax else s

        digitToReplaceMin = None
        for ch in s:
            if ch != '0':
                digitToReplaceMin = ch
                break
        minStr = s.replace(digitToReplaceMin, '0') if digitToReplaceMin else s

        return int(maxStr) - int(minStr)
