class Solution(object):
    def furthestDistanceFromOrigin(self, moves):
        """
        :type moves: str
        :rtype: int
        """
        l_count = 0
        r_count = 0
        for i in moves:
            if i == 'L':
                l_count += 1
            elif i == 'R':
                r_count += 1
        replaced = 'L' if l_count >= r_count else 'R'

        ans = 0 
        moves = moves.replace('_', replaced)
        print(moves)
        for i in moves:
            if i == 'L' :
                ans += -1
            else:
                ans += 1
        return abs(ans)

        