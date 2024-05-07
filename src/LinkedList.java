import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class LinkedList {


    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return nums[i];
            else set.add(nums[i]);
        }
        return -1;
    }
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        while (head!=null){
            if(set.contains(head)) return true;
            else {
                set.add(head);
                head=head.next;
            }
        }
        return false;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int size=0;
        ListNode curr=head;
        while (curr!=null){
            curr=curr.next;
            size++;
        }

        if(size==1) return null;

        curr= head;

        if(size-n==0) {
            curr = curr.next;
            return head;
        }
        for(int i=0;i<size-n-1;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
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
    private ListNode addnode(ListNode head,int data){
        if(head==null) return new ListNode(data);
        ListNode node=head;
        while (node.next!=null)
            node=node.next;
        node.next=new ListNode(data);
        return head;
    }
    public void print(ListNode l2){
        while (l2!=null){
            System.out.print(l2.val+" ->");
            l2=l2.next;
        }
        System.out.println();
    }
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insert(int data, ListNode head){
        ListNode l=new ListNode(data);
        if(head==null)
        {
            head=l;
            return head;
        }
        l.next=head;
        head=l;
        return head;
    }
    public ListNode reverseList(ListNode head) {

        Stack<Integer> stack=new Stack<>();
        ListNode curr=head;
        while (curr!=null){
            stack.push(curr.val);
            curr=curr.next;
        }
        head=null;
        head=new ListNode(stack.pop());
        while (!stack.isEmpty()){
            ListNode ptr=head;
            while (ptr.next!=null) {

                ptr = ptr.next;
            }
            ptr.next=new ListNode(stack.pop());
        }
        return head;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode head=null;
        while (list1!=null && list2!=null){
            if(list1.val <= list2.val)
            {
                if(head==null)
                {
                    head=new ListNode(list1.val);
                    list1=list1.next;
                }
                else {
                    ListNode curr = head;
                    while (curr.next != null) {
                        curr = curr.next;
                    }
                    curr.next=new ListNode(list1.val);
                    list1=list1.next;
                }
            }else {
                if(head==null)
                {
                    head=new ListNode(list2.val);
                    list2=list2.next;
                }
                else {
                    ListNode curr = head;
                    while (curr.next != null) {
                        curr = curr.next;
                    }
                    curr.next=new ListNode(list2.val);
                    list2=list2.next;
                }
            }
        }
        if(list1!=null)
            while (list1!=null){
                ListNode curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next=new ListNode(list1.val);
                list1=list1.next;
            }
        if(list2!=null)
            while (list2!=null){
                ListNode curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next=new ListNode(list2.val);
                list2=list2.next;
            }
        return head;
    }
    public void reorderList(ListNode head) {
        if(head==null) return;
        if(head.next==null) return;
         ListNode ptr1=head;
         int size=size(head);
         ListNode ptr2=assignptr(head);

         while (true){
             ListNode newnode=new ListNode(ptr2.val);
             newnode.next=ptr1.next;
             ptr1.next=newnode;
             ptr1=ptr1.next.next;
             ptr2=ptr2.next;
             if(ptr2==null){
                 ptr1.next=null;
                 break;
             }
         }
       if(size%2==0) {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    private ListNode assignptr(ListNode head){
        ListNode ptr=reverseList(head);
        int size=size(head)/2;
        ListNode curr=ptr;
        for(int i=0;i<size-1;i++)
            curr=curr.next;
        curr.next=null;
        return ptr;
    }

    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        int size=size(head);
        if(size%2==0){
            for(int i=0;i<(size+1)/2;i++)
                head=head.next;
            return head;
        }else{
            for(int i=0;i<(size)/2;i++)
                head=head.next;
            return head;
        }
    }
    public ListNode removeNodes(ListNode head) {
        if(head==null) return null;
        if(head.next==null ) return null;

      //  ListNode ptr=head;
        ListNode left=head;
        ListNode right=head.next;
        ListNode headhead=null;

        while (right!=null){

            if(left.val< right.val)
            {
               add_node(headhead,right);
            }else {
                add_node(headhead,left);
            }
           right=right.next;
           left=left.next;
        }

        return headhead;
    }
    private ListNode add_node(ListNode head,ListNode node){
        ListNode ptr=head;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=node;
        return head;
    }
    public ListNode doubleIt(ListNode head) {
        head=reverseList(head);
        ListNode ptr=head;
        int carry=0;
        while(ptr!=null){
            ptr.val=ptr.val*2+carry;
            carry=0;
            if(ptr.val>=10){
                ptr.val-=10;
                carry=1;
                if(ptr.next==null){
                    ptr.next=new ListNode(1);
                }
            }

            ptr=ptr.next;

        }
        head=reverseList(head);

        return head;
    }


}

