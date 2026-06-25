class Solution(object):
    def countMajoritySubarrays(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if target not in nums:
            return 0
        
        ans = 0
        for i in range(0,len(nums)):
            count = 0
            for j in range(i,len(nums)):
                if nums[j] == target:
                    count+=1
                else:
                    count-=1
                if count > 0 :
                    ans+=1
        return ans

            
        
        