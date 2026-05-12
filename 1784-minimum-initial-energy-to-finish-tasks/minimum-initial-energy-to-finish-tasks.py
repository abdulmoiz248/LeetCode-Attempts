class Solution(object):
    def minimumEffort(self, tasks):
        tasks.sort(key=lambda x: x[1] - x[0], reverse=True)

        initial = 0
        current = 0

        for actual, minimum in tasks:
            if current < minimum:
                needed = minimum - current
                initial += needed
                current += needed

            current -= actual

        return initial