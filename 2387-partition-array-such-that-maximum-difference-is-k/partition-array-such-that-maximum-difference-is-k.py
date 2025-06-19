class Solution(object):
    def partitionArray(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums=sorted(nums)
        seq=1
        prev=nums[0]
        for i in nums[1:]:
            if i-prev>k:
                prev=i
                seq+=1

        return seq