class Solution(object):
    def minElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        j = len(nums) -1
        while i <= j:
            if  nums[i] > 9:
                if nums[i] == 10:
                    nums[i] = 1
                else:
                   nums[i] =  sum(int(ch) for ch in str(nums[i]))

            if  nums[j] > 9 and i!=j:
                if nums[j] == 10:
                    nums[j] = 1
                else:
                   nums[j] =  sum(int(ch) for ch in str(nums[j]))
            i+=1
            j-=1
        print(nums)
        return min(nums)
                   
                    
        