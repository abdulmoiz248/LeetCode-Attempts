# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        if not head or head.next == None or k == 0:
            return head
        
        n = 1
        ptr = head
        while ptr.next: 
            ptr=ptr.next
            n+=1
        
        k = k%n

        if k == 0:
            return head
        
        ptr.next = head

        step = n - k -1
        newptr = head

        for i in range(step):
            newptr = newptr.next

        newHead = newptr.next
        newptr.next = None
        return newHead
            



        