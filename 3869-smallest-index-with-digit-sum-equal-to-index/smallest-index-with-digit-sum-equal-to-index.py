class Solution(object):
    def smallestIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        for i in range(0,len(nums)):
            num_str = str(nums[i])
            total = sum(int(digit) for digit in num_str)

            if total == i:
                return i
        
        return -1
                



