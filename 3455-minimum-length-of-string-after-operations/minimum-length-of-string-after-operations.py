class Solution(object):
    def minimumLength(self, s):
        """
        :type s: str
        :rtype: int
        """
        freq={}
        for c in s:
            freq[c]=freq.get(c,0)+1
        
        length=0
        for c in freq:
            if freq[c]%2==0:
                length+=2
            else: length+=1
        return length

          