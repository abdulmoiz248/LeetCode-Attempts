class Solution(object):
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        ans = strs[0]
        for s in strs[1:]:
            i = 0
            while i < len(ans) and i < len(s) and ans[i] == s[i]:
                i += 1
            ans = ans[:i]
        return ans
