class Solution(object):
    def candy(self, nums):
        """
        :type ratings: List[int]
        :rtype: int
        """
        n=len(nums)
        arr=[1]*n
        for i in range(1,n):
            if nums[i]>nums[i-1]:
                arr[i]=arr[i-1]+1
        for i  in range(n-2,-1,-1):
            if nums[i]>nums[i+1]:
                 arr[i] = max(arr[i], arr[i + 1] + 1)

        return sum(arr)



        