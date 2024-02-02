import org.w3c.dom.NodeList;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();

        LinkedList list=new LinkedList();
        LinkedList.ListNode l=null;
      //  l=  list.insert(5,l);
        l=  list.insert(4,l);
        l=  list.insert(3,l);
        l=  list.insert(2,l);
        l=  list.insert(1,l);
        list.reorderList(l);
        list.print(l);
    }
}