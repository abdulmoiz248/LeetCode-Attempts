class Solution(object):
    def minInsertions(self, s):
        ans = 0
        stack = []
        size = len(s)
        i = 0

        while i < size:
            if s[i] == '(':
                stack.append('(')
            else:
                if i + 1 < size and s[i + 1] == ')':
                    if not stack:
                        ans += 1
                    else:
                        stack.pop()
                    i += 1
                else:
                    ans += 1
                    if not stack:
                        ans += 1
                    else:
                        stack.pop()
            i += 1

        return len(stack) * 2 + ans