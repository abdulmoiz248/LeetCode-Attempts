import heapq
class Solution(object):
    def getFinalState(self, nums, k, multiplier):
        """
        :type nums: List[int]
        :type k: int
        :type multiplier: int
        :rtype: List[int]
        """
        pq=[]
        for n in nums:
            heapq.heappush(pq,n)
        
        for i in range(0,k):
             x=heapq.heappop(pq)
             nums[nums.index(x)]=x*multiplier
             heapq.heappush(pq,x*multiplier)
        
        return nums


        