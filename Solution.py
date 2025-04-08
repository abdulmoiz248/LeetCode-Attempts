class Solution(object):
    def minimumOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        operation=0
        while len(nums) != len(set(nums)):
            if len(nums)<3: 
                return operation+1
            nums=nums[3:]
            print("arr=",nums)
            print("set=",set(nums))
            operation+=1
        
        return operation