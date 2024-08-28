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
    public int getDecimalValue(ListNode head) {
       if(head.next==null) return head.val;
       String str="";
       ListNode ptr=head;
       while(ptr!=null){
          str+=ptr.val;
          ptr=ptr.next;
       }
       return Integer.parseInt(str,2);
    }
}