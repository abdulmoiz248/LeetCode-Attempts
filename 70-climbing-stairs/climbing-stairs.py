class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        memo={}
        return self.stairs(n,memo)
    def stairs(self,n,memo):
        if n==0 or n==1: return 1
        if n not in memo:
            memo[n]=self.stairs(n-1,memo)+self.stairs(n-2,memo)
        return memo[n]    
        