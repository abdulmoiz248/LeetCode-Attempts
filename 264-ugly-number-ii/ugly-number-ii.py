class Solution(object):
    def nthUglyNumber(self, n):
        ugly=[1]
        i2=i3=i5=0

        while len(ugly)<n:
            next1=ugly[i2]*2
            next2=ugly[i3]*3
            next3=ugly[i5]*5

            nextUgly=min(next1,next2,next3)
            ugly.append(nextUgly)
            if nextUgly==next1:
                i2+=1
            if nextUgly==next2:
                i3+=1
            if nextUgly==next3:
                i5+=1
            
        return ugly[-1]
