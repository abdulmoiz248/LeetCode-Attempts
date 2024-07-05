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
      public int[] nodesBetweenCriticalPoints(ListNode head) {
        int size=size(head);
        if(size==2) return new int[]{-1,-1};
        ArrayList<Integer> arr=find_minima(head);
        arr.addAll(find_maxima(head));
   
        Collections.sort(arr);
        if(arr.size()<2)  return new int[]{-1,-1};
        if(arr.size()==2) return new int[]{Math.abs(arr.getFirst()-arr.getLast()),Math.abs(arr.getFirst()-arr.getLast())};
       

        return new int[]{
         smallest_point(arr),Math.abs(arr.getFirst()-arr.getLast())
        };
    }
    private int smallest_point(ArrayList<Integer> arr){
        int small=10000;
        for(int i=0;i<arr.size()-1;i++){
             System.out.println(arr.get(i+1)-arr.get(i));
            if(arr.get(i+1)-arr.get(i)<small) {
                small=arr.get(i+1)-arr.get(i);
                  System.out.println("New Small="+small);
            }
        }
        return small;
    }
    private  ArrayList<Integer> find_minima(ListNode head){
        ListNode prev=head;
        ListNode ptr=head.next;
        ArrayList<Integer> min=new ArrayList<>();
        int index=2;
        while (ptr.next!=null){
            if(prev.val>ptr.val && ptr.val<ptr.next.val){
                min.add(index);
            }
            index++;
            ptr=ptr.next;
            prev=prev.next;
        }
        for(int x:min)
            System.out.println("Min"+x);
        return min;
    }

    private  ArrayList<Integer> find_maxima(ListNode head){
        ListNode prev=head;
        ListNode ptr=head.next;
        ArrayList<Integer> max=new ArrayList<>();
        int index=2;
        while (ptr.next!=null){
            if(prev.val<ptr.val && ptr.val>ptr.next.val){
                max.add(index);
            }
            index++;
            ptr=ptr.next;
            prev=prev.next;
        }
        for(int x:max)
            System.out.println("Max"+x);
        return max;
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