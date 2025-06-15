class Solution(object):
    def maxDiff(self, num):
        s = str(num)
        for ch in s:
            if ch != '9':
                maxStr = s.replace(ch, '9')
                break
        else:
            maxStr = s

        
        if s[0] != '1':
            minStr = s.replace(s[0], '1')
        else:
            for ch in s[1:]:
                if ch != '0' and ch != '1':
                    minStr = s.replace(ch, '0')
                    break
            else:
                minStr = s

        return int(maxStr) - int(minStr)
