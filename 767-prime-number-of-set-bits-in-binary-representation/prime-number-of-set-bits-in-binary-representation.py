class Solution(object):
    def countPrimeSetBits(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: int
        """
        prime={2,3,5,7,11,13,17,19}
        count=0
        for i in range(left,right+1):
            s=str(bin(i)).count('1')
            if s in prime: count+=1
        return count
            

        