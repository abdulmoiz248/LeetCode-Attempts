class MinStack {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node arr;
    int top=-1;
    public MinStack() {

    }

    public void push(int val) {
        top++;
        if(arr==null){
            arr=new Node(val);
            return;
        }
        Node node=new Node(val);
        node.next=arr;
        arr=node;
    }

    public void pop() {
        top--;
        arr=arr.next;
    }

    public int top() {
        return arr.data;
    }

    public int getMin() {
        Node ptr=arr.next;
        int min=arr.data;
        while (ptr!=null){
            if(min> ptr.data){
                min= ptr.data;
            }
            ptr=ptr.next;
        }
        return min;
    }
}


