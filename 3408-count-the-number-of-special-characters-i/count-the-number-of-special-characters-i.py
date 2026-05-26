class Solution(object):
    def numberOfSpecialChars(self, word):
        """
        :type word: str
        :rtype: int
        """

        lowerSet = set()
        upperSet = set()

        for ch in word:
            if ch.islower():
                lowerSet.add(ch)
            else:
                upperSet.add(ch.lower())

        count = 0

        for ch in lowerSet:
            if ch in upperSet:
                count += 1

        return count