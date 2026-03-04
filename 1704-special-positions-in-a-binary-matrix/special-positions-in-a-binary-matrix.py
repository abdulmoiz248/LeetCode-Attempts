class Solution(object):
    def numSpecial(self, mat):
        def checkRow(i, sq):
            count = 0
            for k in range(len(sq[0])):
                if sq[i][k] == 1:
                    count += 1
            return count == 1
        
        def checkCol(j, sq):
            count = 0
            for k in range(len(sq)):
                if sq[k][j] == 1:
                    count += 1
            return count == 1
        
        ans = 0
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                if mat[i][j] == 1 and checkRow(i, mat) and checkCol(j, mat):
                    ans += 1

        return ans