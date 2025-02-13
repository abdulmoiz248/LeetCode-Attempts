class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if len(nums)<2: return -1 
        heapq.heapify(nums)
        if len(nums)<2 or nums[0]>=k: return 0
        operation=0
        while nums[0]<k and len(nums)>=2:
           if len(nums)<2: return operation 
           x= heapq.heappop(nums)
           y=heapq.heappop(nums)
           num=min(x, y) * 2 + max(x, y)
           heapq.heappush(nums, num)
           operation+=1
        return operation

        