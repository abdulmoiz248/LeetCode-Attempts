class Solution(object):
    def countCommas(self, n):
        """
        :type n: int
        :rtype: int
        """
        num_with_zero_comma = 1000
        answer = 0

        while num_with_zero_comma <= n:
            answer += n - num_with_zero_comma + 1
            num_with_zero_comma *= 1000 # becuase we have comma after 3 digits
        
        return answer


