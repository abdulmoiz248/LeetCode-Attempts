class Solution(object):
    def areAlmostEqual(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        if s1==s2: return True
        count = 0
        diff = []

        for i in range(len(s1)):
            if s1[i] != s2[i]:
                diff.append(i)
                count += 1
                if count > 2:  
                    return False

        if count == 0:  
            return True
        if count == 2 and s1[diff[0]] == s2[diff[1]] and s1[diff[1]] == s2[diff[0]]:
            return True
        return False
