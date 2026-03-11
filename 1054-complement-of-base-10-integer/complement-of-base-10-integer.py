class Solution(object):
    def bitwiseComplement(self, n):
        """
        :type n: int
        :rtype: int
        """
        n=str(bin(n))
        print(n[2:])
        newStr=""
        for i in n[2:]:
            
            if i=='0':
                newStr+='1'
            else:
                newStr+='0'
        return int(newStr,2)

        