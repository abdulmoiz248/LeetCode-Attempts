class Solution(object):
    def findKDistantIndices(self, nums, key, k):
        """
        :type nums: List[int]
        :type key: int
        :type k: int
        :rtype: List[int]
        """
        ans=[]
        size=len(nums)
        for i in range(size):
            for j in range(max(0,i-k),min(size,i+k+1)):
                if nums[j]==key:
                    ans.append(i)
                    break
        return ans
        