class Solution(object):
    def totalNumbers(self, digits):
        """
        :type digits: List[int]
        :rtype: int
        """
        ans = set()

        for i in range(len(digits)):
            if digits[i] == 0:
                continue

            for j in range(len(digits)):
                if i == j:
                    continue

                for k in range(len(digits)):
                    if i == k or j == k:
                        continue

                    num = digits[i] * 100 + digits[j] * 10 + digits[k]

                    if num % 2 == 0:
                        ans.add(num)

        return len(ans)