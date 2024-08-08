class Solution(object):
    def spiralMatrixIII(self, rows, cols, rStart, cStart):
        """
        :type rows: int
        :type cols: int
        :type rStart: int
        :type cStart: int
        :rtype: List[List[int]]
        """
        i,j=rStart,cStart
        diri,dirj=0,1
        changeDirection=2
        result=[]
        moves=1
        nextMoves=2
        twice=2

        while  len(result)<(rows*cols) :
            if i>-1 and i<rows and j>-1 and j<cols:
                result.append([i,j])
            i+=diri
            j+=dirj
            moves-=1
            if moves==0:
                diri,dirj=dirj,-diri
                twice-=1
                if twice==0:
                 moves=nextMoves
                 nextMoves+=1
                 twice=2
                else:
                    moves=nextMoves-1
        return result             

            
