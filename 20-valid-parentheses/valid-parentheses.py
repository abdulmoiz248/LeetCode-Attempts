class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) == 1: return False
        stack = []

        for i in s:
            if i == '(' or i == '[' or i == '{' :
                stack.append(i)
            else:
                if len(stack) == 0:
                    return False
                if stack[-1] != '(' and i == ')':
                    return False
                elif stack[-1] != '[' and i == ']':
                    return False
                elif stack[-1] != '{' and i == '}':
                    return False
                
                stack.pop()
        
        if len(stack) != 0:
                    return False
                    
        
        return True            
