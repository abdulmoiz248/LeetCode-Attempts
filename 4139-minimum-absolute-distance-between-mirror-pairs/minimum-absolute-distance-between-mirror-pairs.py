class Solution(object):
    def minMirrorPairDistance(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dic = {}
        ans = float('inf')

        for i in range(len(nums)):
            if nums[i] in dic:
                ans = min(ans, abs(i - dic.get(nums[i])))
            
            dic[int(str(nums[i])[::-1])] = i

        return ans if ans != float('inf') else -1 