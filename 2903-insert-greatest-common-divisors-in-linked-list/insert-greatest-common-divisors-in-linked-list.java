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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
     ListNode ptr=head;
     while(ptr!=null && ptr.next!=null){
        ListNode temp=new ListNode(gcd(ptr.val,ptr.next.val));
        temp.next=ptr.next;
        ptr.next=temp;
        ptr=ptr.next.next;
     }   
     return head;
     
    }
       public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}