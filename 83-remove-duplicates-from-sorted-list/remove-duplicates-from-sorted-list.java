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
        if(head==null) return head;
        if(head.next==null) return head;
       ListNode ptr=head.next;
       ListNode curr=head;
       while(ptr!=null){
         if(ptr.val==curr.val){
            curr.next=curr.next.next;
         }else  curr=curr.next;
         ptr=ptr.next;
        
       } 
       return head;
    }
}