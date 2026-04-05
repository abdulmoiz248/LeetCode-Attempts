class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        ver=0
        hor=0
        for move in moves:
            if move=='U':
                ver+=1
            elif move == 'D':
                ver-=1
            elif move=='L':
                hor+=1
            else:
                hor-=1
        return ver==0 and hor==0