class Solution(object):
    def removeOccurrences(self, s, part):
        """
        :type s: str
        :type part: str
        :rtype: str
        """
        stack=[]
        for c in s:
            stack.append(c)
            if len(s)>=len(part) and "".join(stack[-len(part):])==part:
                del stack[-len(part):]
        return "".join(stack)

        