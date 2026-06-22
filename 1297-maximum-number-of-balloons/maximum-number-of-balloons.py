class Solution(object):
    def maxNumberOfBalloons(self, text):
        """
        :type text: str
        :rtype: int
        """
        arr = { 'b': 0,
        'a' : 0,
        'l' : 0,
        'o' : 0,
        'n' :0
        }

        for i in text:
            if i in arr:
                arr[i] = arr.get(i,0) + 1 
        
        ans = float('inf')
        for i in arr:
            if i != 'l' and i!='o':
                ans = min(arr.get(i,0),ans)
            else:
                ans = min(arr.get(i,0) //2, ans)
        print(arr," ", ans)
        return ans
        