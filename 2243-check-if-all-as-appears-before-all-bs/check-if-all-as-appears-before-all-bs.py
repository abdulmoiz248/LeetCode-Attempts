class Solution(object):
    def checkString(self, s):
        """
        :type s: str
        :rtype: bool
        """
        b_seen = False
        for i in s:
            if i == 'b' and not b_seen:
                b_seen = True
            elif i == 'a' and b_seen:
                return False
        return True