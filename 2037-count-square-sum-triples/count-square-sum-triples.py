class Solution(object):
    def countTriples(self, n):
        total = 0
        for i in range(1, n + 1):
            for j in range(i + 1, n + 1):
                c = (i*i + j*j)**0.5
                if c.is_integer() and c <= n:
                    total += 2
        return total
