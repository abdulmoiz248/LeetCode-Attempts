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
    public ListNode mergeNodes(ListNode head) {
        ListNode newhead=head.next;
        ListNode curr=newhead;

        while(curr!=null){
            int sum=0;

            while(curr.val!=0){
             sum+=curr.val; 
             curr=curr.next;  
            }
          newhead.val=sum;
          curr=curr.next; 
          newhead.next=curr;
          newhead=newhead.next;
          
        }

      

        
        return head.next;
    }
}