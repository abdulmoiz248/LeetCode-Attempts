class FindSumPairs(object):
    def __init__(self, nums1, nums2):
        self.nums1 = nums1
        self.nums2 = nums2
        self.dic = {}
        for i in nums2:
            self.dic[i] = self.dic.get(i, 0) + 1

    def add(self, index, val):
        oldVal = self.nums2[index]
        self.dic[oldVal] -= 1
        if self.dic[oldVal] == 0:
            del self.dic[oldVal]
        self.nums2[index] += val
        newVal = self.nums2[index]
        self.dic[newVal] = self.dic.get(newVal, 0) + 1

    def count(self, tot):
        count = 0
        for i in self.nums1:
            target = tot - i
            if target in self.dic:
                count += self.dic[target]
        return count
