class Solution(object):
    def numberOfSpecialChars(self, word):
        """
        :type word: str
        :rtype: int
        """
        count = 0
        lower_last = {}
        upper_first = {}

        for index,j in enumerate(word):
            if j.islower():
                 lower_last[j] = index
            else:
                if j not in upper_first:
                    upper_first[j] = index


        for i in lower_last:
            if i.upper() in upper_first:
                if upper_first.get(i.upper()) > lower_last.get(i):
                    count+=1
        return count 

        