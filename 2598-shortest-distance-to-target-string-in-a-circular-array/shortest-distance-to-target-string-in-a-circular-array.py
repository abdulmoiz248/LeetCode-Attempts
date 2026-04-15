class Solution(object):
    def closestTarget(self, words, target, startIndex):
        """
        :type words: List[str]
        :type target: str
        :type startIndex: int
        :rtype: int
        """
        ans=float('inf')
        n = len(words)
        for i in range(n):
            if words[i] == target:
                ans = min(ans,abs(i - startIndex), n - abs(i - startIndex))
        return ans if ans < n else -1


        