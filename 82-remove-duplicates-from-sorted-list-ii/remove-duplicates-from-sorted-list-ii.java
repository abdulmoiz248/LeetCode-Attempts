/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         if (head == null) return null;
          while (head != null && head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next; 
            }
            head = head.next; 
        }
        
        ListNode curr=head;
         
        while (curr != null && curr.next != null) {
              if (curr.next.next != null && curr.next.val == curr.next.next.val) {
                int dupValue = curr.next.val;
              
                while (curr.next != null && curr.next.val == dupValue) {
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;  
            }
        }
        return head;
        }
        }
        