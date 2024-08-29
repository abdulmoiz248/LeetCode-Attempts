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
    public boolean isPalindrome(ListNode head) {
        ListNode ptr=head;
        String str="";
        while(ptr!=null){
          str+=ptr.val; 
          ptr=ptr.next;
        } 
       
        StringBuilder reversedStr = new StringBuilder(str);
    //     System.out.println(str+" "+reversedStr.reverse());
       
        String str2=reversedStr.reverse().toString();
        return str.equals(str2);
    }
}