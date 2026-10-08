class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        new_str = ""
        start_index = -1
        end_index = -1
        balance = 0

        for i in range(0,len(s)):
            if s[i] == '(':
                if balance == 0:
                    start_index = i
                balance +=1
            else:
                balance -= 1
                if balance == 0 :
                    new_str += s[start_index+1:i]

        return new_str  