class Solution(object):
    def canAliceWin(self, n):
        """
        :type n: int
        :rtype: bool
        """
        turn = 10
        isAlice = True

        while n >= turn:
            n -= turn
            turn -= 1
            isAlice = not isAlice

        return not isAlice


