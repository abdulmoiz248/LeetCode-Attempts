# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def pairSum(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: int
        """
        stack = []
        curr = head
        ptr = head
        
        while ptr and ptr.next:
            stack.append(curr.val)
            ptr = ptr.next.next
            curr = curr.next
        
        ans = 0
        while curr:
            ans = max(ans,curr.val + stack.pop())
            curr = curr.next
        
        return ans

        