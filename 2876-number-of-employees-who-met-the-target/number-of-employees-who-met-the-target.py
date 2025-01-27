class Solution(object):
    def numberOfEmployeesWhoMetTarget(self, hours, target):
        """
        :type hours: List[int]
        :type target: int
        :rtype: int
        """
        left=0
        right=len(hours)-1
        count=0
        while left<=right:
            if hours[left]>=target: count+=1
            if left==right: break
            if hours[right]>=target: count+=1

            left+=1
            right-=1
        return count
        