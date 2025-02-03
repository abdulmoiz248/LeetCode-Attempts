class Solution(object):
    def longestMonotonicSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 1  
        inc = 1 
        dec = 1 

        for a, b in zip(nums, nums[1:]): 
            if a < b:  
                inc += 1
                dec = 1  
            elif a > b:  
                dec += 1
                inc = 1 
            else:  
                inc = 1
                dec = 1

            ans = max(inc, dec, ans)

        return ans
