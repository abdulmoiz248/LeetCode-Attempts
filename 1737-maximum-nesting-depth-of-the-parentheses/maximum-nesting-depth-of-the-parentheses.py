class Solution(object):
    def maxDepth(self, s):
        """
        :type s: str
        :rtype: int
        """
        stack = []
        ans = 0

        for i in s:
            if i == '(':
                stack.append(i)
            elif i == ')':
                ans = max(ans, len(stack))
                stack.pop()
        return ans

        