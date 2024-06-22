class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        news=s.split()
        index=len(news)-1
        string=''
        while index>=0:
         string+=news[index]
         if index !=0:
            string+=' '
         index=index-1   
        return string
        