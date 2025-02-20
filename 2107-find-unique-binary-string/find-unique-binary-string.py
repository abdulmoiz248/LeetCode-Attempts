import random
class Solution(object):
    def findDifferentBinaryString(self, nums):
        """
        :type nums: List[str]
        :rtype: str
        """
        while True:
            n=self.shuffle_string(len(nums[0]))
            print(n)
            if n not in nums: return n

    def shuffle_string(self, length):
     string = ['0', '1'] 
     newStr = ''.join(random.choice(string) for _ in range (length))          
     return newStr


            


        