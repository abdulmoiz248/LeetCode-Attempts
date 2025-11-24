class Solution(object):
    def prefixesDivBy5(self, nums):
        """
        :type nums: List[int]
        :rtype: List[bool]
        """
        num=''
        ans=[]
        for i in nums:
            num+=str(i)
            decimalNumber = int(num, 2)
            if decimalNumber % 5 == 0:
                ans.append(True)
            else: ans.append(False)
        return ans


        