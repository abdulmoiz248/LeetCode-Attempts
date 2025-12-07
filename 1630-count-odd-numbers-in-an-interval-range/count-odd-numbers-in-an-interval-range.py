class Solution(object):
    def countOdds(self, low, high):
        total = high - low + 1
        if total % 2 == 0:
            return total // 2
        if low % 2 == 1 and high % 2 == 1:
            return total // 2 + 1
        return total // 2
