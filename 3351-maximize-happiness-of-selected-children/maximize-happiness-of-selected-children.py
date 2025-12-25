import heapq
class Solution(object):
    def maximumHappinessSum(self, happiness, k):
        """
        :type happiness: List[int]
        :type k: int
        :rtype: int
        """
        pq = []
        for i in happiness:
            heapq.heappush(pq, -i)
        ans=0
        for i in range(0,k):
            element=-heapq.heappop(pq)
            if element-i>0: ans+=element-i
        return ans

        