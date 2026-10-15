class Solution(object):
    def sumCounts(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        

        ans = 0 

        for i in range(0,len(nums)):
            seen = set()
            for j in range(i  ,len(nums)):
                seen.add(nums[j])
                ans += len(seen) * len(seen)
        
        return ans

                    
