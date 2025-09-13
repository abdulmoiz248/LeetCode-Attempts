class Solution(object):
    def maxFreqSum(self, s):
        vowels = set("aeiou")
        freq = {}
        
        maxV, maxC = 0, 0
        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1
            if ch in vowels:
                maxV = max(maxV, freq[ch])
            else:
                maxC = max(maxC, freq[ch])
        
        return maxV + maxC
