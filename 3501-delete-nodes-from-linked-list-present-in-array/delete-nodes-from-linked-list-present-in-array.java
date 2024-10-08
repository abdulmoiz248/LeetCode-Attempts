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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        while(head!=null && head.next!=null && set.contains(head.val)){
            head=head.next;
        }

        ListNode ptr=head;
        while(ptr!=null && ptr.next!=null){
            if(set.contains(ptr.next.val)){
                ptr.next=ptr.next.next;
            }else
            ptr=ptr.next;
        }
        return head;
    }
}