class Solution(object):
    def isPrefixOfWord(self, sentence, searchWord):
        """
        :type sentence: str
        :type searchWord: str
        :rtype: int
        """
        arr=sentence.split()
        print(arr)
        index=0
        for string in  arr:
            if searchWord ==string[:len(searchWord)]:
                 index+=1
                 return index
            index+=1 
        return -1   