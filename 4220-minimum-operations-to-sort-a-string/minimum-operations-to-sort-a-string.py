class Solution(object):
    def minOperations(self, s):
        if s == "".join(sorted(s)):
            return 0

        if len(s) == 2:
            return -1

        largest_char = max(s)
        smallest_char = min(s)

        if s[0] == smallest_char or s[-1] == largest_char:
            return 1

        if s[0] == largest_char and s[-1] == smallest_char:
            if s.count(largest_char) == 1 and s.count(smallest_char) == 1:
                return 3

        return 2