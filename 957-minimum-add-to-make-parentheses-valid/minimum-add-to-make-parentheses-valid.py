class Solution(object):
    def minAddToMakeValid(self, s):
        """
        :type s: str
        :rtype: int
        """
        complete_brackets = 0
        need_to_add = 0

        for i in s:
            if i == '(':
                complete_brackets += 1
            else:
                if complete_brackets > 0:
                    complete_brackets -= 1
                    continue
                
                need_to_add += 1
        
        return need_to_add + complete_brackets
                

        