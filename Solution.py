class Solution(object):
    def getLongestSubsequence(self, words, groups):
        """
        :type words: List[str]
        :type groups: List[int]
        :rtype: List[str]
        """
        size=len(words)
        ans=[]
        for i in range(size):
            prev=groups[i]
            arr=[words[i]]
            
            for j in range(i+1,size):
                if prev==0 and groups[j]==1 or prev==1 and groups[j]==0:
                    arr.append(words[j])
                    if prev==0 : prev=1
                    else: prev=0
            if len(arr)>len(ans):
                ans=arr
        return ans

    
    def minimumOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        operation=0
        while len(nums) != len(set(nums)):
            if len(nums)<3: 
                return operation+1
            nums=nums[3:]
            print("arr=",nums)
            print("set=",set(nums))
            operation+=1
        
        return operation
     def countLargestGroup(self, n):
        """
        :type n: int
        :rtype: int
        """
        arr = {}
        maximum = 0
        for i in range(1, n + 1):
            digitSum = sum(int(d) for d in str(i))
            arr[digitSum] = arr.get(digitSum, 0) + 1
            maximum = max(maximum, arr[digitSum])
        
        return sum(1 for count in arr.values() if count == maximum)
