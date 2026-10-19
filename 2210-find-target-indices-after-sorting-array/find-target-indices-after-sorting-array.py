class Solution(object):
    def targetIndices(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        ans = []
        nums.sort()
        for i in range(0,len(nums)):
            if nums[i] == target:
                ans.append(i)
            elif nums[i] > target:
                break
        return ans
        