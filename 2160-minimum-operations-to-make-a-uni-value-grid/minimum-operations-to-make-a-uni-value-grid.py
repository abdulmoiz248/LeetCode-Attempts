class Solution(object):
    def minOperations(self, grid, x):
        """
        :type grid: List[List[int]]
        :type x: int
        :rtype: int
        """
        arr = []
        base = grid[0][0] % x

        for row in grid:
            for col in row:
                if col % x != base:
                    return -1
                arr.append(col)

        arr.sort()
        median = arr[len(arr)//2]

        moves = 0
        for i in arr:
            moves += abs(median - i) // x

        return moves               

            