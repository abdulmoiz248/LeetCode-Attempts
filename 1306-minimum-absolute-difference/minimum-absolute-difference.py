class Solution(object):
    def minimumAbsDifference(self, arr):
        """
        :type arr: List[int]
        :rtype: List[List[int]]
        """
        
        ans=[]
        arr.sort()
        size=len(arr)
        if size==2: return [arr]
        diff=arr[size-1]
        for i in range(0,size-1):
            print("diff=",diff)
            print("curr diff=",[arr[i],arr[i+1]])
            if diff>arr[i+1]-arr[i]:
                diff=arr[i+1]-arr[i]
                ans=[[arr[i],arr[i+1]]]
            elif arr[i+1]-arr[i]==diff: 
                ans.append([arr[i],arr[i+1]])
        return ans


        