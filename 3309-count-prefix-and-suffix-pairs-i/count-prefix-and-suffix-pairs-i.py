class Solution(object):
    def countPrefixSuffixPairs(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        count=0
        for i in range(len(words)-1):
            for j in range(i+1,len(words)):
                if  self.isPrefixAndSuffix(words[i],words[j]): count+=1
        return count
    def isPrefixAndSuffix(self,str1, str2):
     return str1 == str2[0:len(str1)] and str1 == str2[len(str2)-len(str1):]
        