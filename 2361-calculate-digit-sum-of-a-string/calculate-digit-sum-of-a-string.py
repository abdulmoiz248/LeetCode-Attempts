class Solution(object):
    def digitSum(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        
     

        while len(s) > k:
            arr = []
            for i in range(0,len(s),k):
                ans = 0
                for j in range(i,min(i + k , len(s))):
                    ans += int(s[j])
                arr.append(str(ans))
            s = "".join(arr)
    
        return s

