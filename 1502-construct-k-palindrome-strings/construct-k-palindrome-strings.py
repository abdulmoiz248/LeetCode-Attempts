class Solution(object):
    def canConstruct(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: bool
        """
        if len(s) <k: return False
        char={}
        for c in s:
             char[c] = char.get(c, 0) + 1 
        
        odd=0

        for c in char:
            if char[c]%2!=0: odd+=1

        if odd>k: return False            
        return True
        