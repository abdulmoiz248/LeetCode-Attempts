class Solution(object):
    def findThePrefixCommonArray(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]
        """
        c=[]
        freq={}
        count=0
        for i in range(0,len(A)):
            freq[A[i]]=freq.get(A[i],0)+1    
            if freq[A[i]]==2:
                count+=1
            freq[B[i]]=freq.get(B[i],0)+1    
            if freq[B[i]]==2:
                count+=1
            c.append(count)
        return c
        