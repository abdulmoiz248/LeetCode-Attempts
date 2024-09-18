class Solution(object):
    def largestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: str
        """
        numStr=[str(n) for n in nums]
        numStr.sort(key =lambda a:a*10,reverse=True)
        if numStr[0]=='0':  return '0'
        return "".join(numStr)
