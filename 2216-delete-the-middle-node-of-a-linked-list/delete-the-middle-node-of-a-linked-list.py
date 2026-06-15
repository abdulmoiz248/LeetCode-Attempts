# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteMiddle(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        ptr = head
        middle = 0
        while ptr.next != None:
            middle+=1
            ptr = ptr.next
        
        middle -= 1
        middle = int(math.ceil(middle/2))
        print(middle)
        if middle < 0: return None

        ptr = head
        for i in range(0,middle):
            ptr = ptr.next
        ptr.next = ptr.next.next

        return head
        