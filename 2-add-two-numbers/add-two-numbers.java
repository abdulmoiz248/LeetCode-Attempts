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
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      if(l1==null || l2==null) return null;

      if(size(l1)<size(l2)){
        ListNode ptr=l2;
        while (ptr!=null){
            try {
                ptr.val=ptr.val+ l1.val;
                 l1=l1.next;
            }catch (Exception e){

            }
            if(ptr.val>=10){
                ptr.val-=10;
                if(ptr.next!=null){
                    ptr.next.val+=1;
                }else {
                    ptr.next=new ListNode(1);
                    return l2;
                }
            }
            ptr=ptr.next;
           
        }
        return l2;
      }else {
          ListNode ptr=l1;
          while (ptr!=null){
              try {
                  ptr.val=ptr.val+ l2.val;
                  l2=l2.next;
              }catch (Exception e){

              }
              if(ptr.val>=10){
                  ptr.val-=10;
                  if(ptr.next!=null){
                      ptr.next.val+=1;
                  }else {
                      ptr.next=new ListNode(1);
                     return l1;
                  }
              }
              ptr=ptr.next;
            
          }
          return l1;
      }
      }
       private int size(ListNode head){
        ListNode curr=head;
        int size=0;
        while (curr!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }
}