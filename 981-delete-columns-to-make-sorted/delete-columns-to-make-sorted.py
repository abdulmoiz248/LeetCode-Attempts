class Solution(object):
    def minDeletionSize(self, strs):
        """
        :type strs: List[str]
        :rtype: int
        """
        count=0
        for col in range(0,len(strs[0])):
            for row in range(1,len(strs)):
                if strs[row][col]<strs[row-1][col]:
                    count+=1
                    break
        return count


        