class Solution(object):
    def rotateTheBox(self, boxGrid):
        m = len(boxGrid)
        n = len(boxGrid[0])

        for row in boxGrid:
            i = n - 1
            for j in range(n - 1, -1, -1):
                if row[j] == '*':
                    i = j - 1
                elif row[j] == '#':
                    row[j], row[i] = '.', '#'
                    i -= 1

        res = [[None] * m for _ in range(n)]
        for i in range(m):
            for j in range(n):
                res[j][m - 1 - i] = boxGrid[i][j]

        return res