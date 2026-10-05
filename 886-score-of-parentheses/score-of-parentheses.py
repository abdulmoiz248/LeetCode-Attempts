class Solution(object):
    def scoreOfParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        stack = [0]

        for i in s:
            if i == '(':
                stack.append(0)
            else:
                curr = stack.pop()
                score = stack.pop()

                stack.append(score + max(1,2 * curr))
        
        return stack.pop()
        