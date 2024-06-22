class Solution(object):
 def mergeAlternately(self, word1, word2):
  news = ''
  index = 0

  if len(word1) == len(word2):
    while index<len(word1):
        news+=word1[index]+word2[index]
        index=index+1
    return news
  
  if len(word1)>len(word2):
      while index < len(word2):
       news += word1[index] + word2[index]
       index = index + 1
      while index < len(word1):
          news += word1[index]
          index = index + 1
      return news   
       
  if len(word1)<len(word2):
      while index < len(word1):
       news += word1[index] + word2[index]
       index = index + 1
      while index < len(word2):
          news += word2[index]
          index = index + 1
      return news
        