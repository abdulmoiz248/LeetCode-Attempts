class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        size=len(digits)
        if digits[size-1]!=9:
            digits[size-1]+=1
            return digits

        carry=1
        for i in range(size-1,-1,-1):
            if digits[i]+carry==10:
                digits[i]=0
                carry=1
            else:
                digits[i]+=carry
                carry=0
                break

        if carry==1:
          return [1]+ digits
        return digits
        