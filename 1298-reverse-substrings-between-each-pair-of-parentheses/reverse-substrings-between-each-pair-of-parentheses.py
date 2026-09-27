class Solution(object):
    def reverseParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """

        stack = []

        for i in s:

            if i == ')':
                arr = []

                while stack[-1] != '(':
                    arr.append(stack.pop())
                
                stack.pop()
                stack.extend(arr)
            else:
                stack.append(i)
        return "".join(stack)
        