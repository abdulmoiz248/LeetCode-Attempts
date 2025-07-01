class Solution(object):
    def possibleStringCount(self, word):
        ans = 1  
        left = 0
        right = 1
        n = len(word)

        while right <= n:
        
            if right == n or word[right] != word[left]:
                groupLen = right - left
                if groupLen > 1:
                    ans += groupLen - 1
                left = right
            right += 1

        return ans
