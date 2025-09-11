class Solution(object):
    def sortVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowels = ['a','e','i','o','u','A','E','I','O','U']
        arr=[]
        for i  in s:
            if i in vowels:
                arr.append(i)
        
        arr= sorted(arr, key=lambda x: ord(x))
        count=0
        string=''
        for i  in s:
            if i in vowels:
              string+=arr[count]
              count+=1
            else:
                string+=i
        return string
                



        