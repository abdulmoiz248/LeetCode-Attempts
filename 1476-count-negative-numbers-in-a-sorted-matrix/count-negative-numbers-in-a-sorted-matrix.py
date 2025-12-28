class Solution(object):
    def countNegatives(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        count=0
        for arr in grid:
            #base case
            if arr[0]<0: 
                count+=len(arr)
                continue
            for i in arr[::-1]:
                if i>=0: continue
                count+=1
        return count


        