class Solution(object):
    def minimumBoxes(self, apple, capacity):
        """
        :type apple: List[int]
        :type capacity: List[int]
        :rtype: int
        """
        capacity.sort(reverse=True)
        total=sum(apple)
        print("total apples=" ,total)
        print(capacity)
        ans=0
        for i in capacity:
            if total<=0: return ans
            total-=i
            print("total=",total)
            ans+=1
        return ans
        