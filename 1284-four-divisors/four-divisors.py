class Solution(object):
    def sumFourDivisors(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def findDivisors(num):
            sum=0
            count=0
            i=1
            while i*i<=num:
                if num%i==0:
                    j=num//i
                    if i==j:
                      sum+=i
                      count+=1
                    else:
                        sum+=i+j
                        count+=2
                if count>4: return 0
                i+=1
            if count==4: return sum
            return 0
        sum=0
        for i in nums:
            sum+=findDivisors(i)
        return sum

        