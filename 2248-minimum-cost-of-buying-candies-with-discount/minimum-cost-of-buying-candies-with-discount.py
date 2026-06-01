class Solution(object):
    def minimumCost(self, cost):
        cost.sort(reverse=True)
        ans = 0

        i = 0
        size = len(cost)

        while i < size:
            ans += cost[i]

            if i + 1 < size:
                ans += cost[i + 1]

            i += 3

        return ans