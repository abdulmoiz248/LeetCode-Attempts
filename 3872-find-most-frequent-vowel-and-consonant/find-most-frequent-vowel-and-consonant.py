class Solution(object):
    def maxFreqSum(self, s):
        """
        :type s: str
        :rtype: int
        """
        const={}
        vowels={}
        vowel='aieou'

        for i in s:
            if i in vowel:
                vowels[i]=vowels.get(i,0)+1
            else:
                const[i]=const.get(i,0)+1
        maxV=0
        for i in vowel:
            if maxV<vowels.get(i,0):
                maxV=vowels.get(i,0)
        maxC=0
        for i in const:
            if maxC<const.get(i,0):
                maxC=const.get(i,0) 
        return maxV+maxC       
        