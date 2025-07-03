class Solution(object):
    def kthCharacter(self, k):
        """
        :type k: int
        :rtype: str
        """
        string='a'
        while len(string)<k:
            nextPart=''
            for words in string:
                nextChar=chr((ord(words) - ord('a') + 1) % 26 + ord('a'))
                nextPart+=nextChar
            string+=nextPart
        return string[k-1]

        