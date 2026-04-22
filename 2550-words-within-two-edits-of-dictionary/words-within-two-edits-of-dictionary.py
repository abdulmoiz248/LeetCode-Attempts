class Solution(object):
    def twoEditWords(self, queries, dictionary):
        """
        :type queries: List[str]
        :type dictionary: List[str]
        :rtype: List[str]
        """
        ans = []
        for q in queries:
            for d in dictionary:
                
                count = 0
                for i in range(len(d)):
                    if q[i] != d[i]:
                        count += 1
                        if count > 2:
                            break
                if count <= 2:
                    ans.append(q)
                    break
        return ans
        