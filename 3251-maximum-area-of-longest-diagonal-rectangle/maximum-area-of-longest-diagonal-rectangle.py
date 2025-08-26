class Solution(object):
    def areaOfMaxDiagonal(self, nums):
        """
        :type nums: List[List[int]]
        :rtype: int
        """
        maxArea = 0
        maxDiagonal = 0
        for i, j in nums:
            diagonal = i*i + j*j  # use squared diagonal
            area = i * j
            if diagonal > maxDiagonal or (diagonal == maxDiagonal and area > maxArea):
                maxDiagonal = diagonal
                maxArea = area
        return maxArea