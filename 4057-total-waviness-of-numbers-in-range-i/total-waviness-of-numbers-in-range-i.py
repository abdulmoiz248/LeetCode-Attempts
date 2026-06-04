class Solution(object):
    def totalWaviness(self, num1, num2):
        """
        :type num1: int
        :type num2: int
        :rtype: int
        """
        ans = 0
        for num in range(num1,num2+1):
            str_num = str(num)

            for i in range(1,len(str_num)-1):
                if int(str_num[i]) > int(str_num[i-1]) and int(str_num[i])  > int(str_num[i+1]):
                    ans+=1
                elif int(str_num[i]) < int(str_num[i-1]) and int(str_num[i]) < int(str_num[i+1]):
                    ans+=1
        return ans
