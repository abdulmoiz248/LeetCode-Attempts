class Solution(object):
    def maxDepthAfterSplit(self, seq):
        """
        :type seq: str
        :rtype: List[int]
        """
        n_a = 0
        output = []

        for i in seq:
            if i == '(':
                output.append(n_a%2)
                n_a+=1
            elif i == ')':
                n_a -= 1
                output.append(n_a%2)

        return output
        