class Solution(object):
    def binaryGap(self, n):
        """
        :type n: int
        :rtype: int
        """
        s=str(bin(n))

        ptr1=0
        while s[ptr1]!='1': ptr1+=1
        ptr2=ptr1+1
        ans=0
        while ptr2<len(s):
            if s[ptr1]=='1' and s[ptr2]=='1':
                ans=max(ans,abs(ptr1-ptr2))
                ptr1=ptr2
                ptr2+=1
            elif s[ptr2]!='1' and s[ptr1]=='1':
                ptr2+=1 
        return ans

        