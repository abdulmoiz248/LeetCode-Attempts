class CustomStack {
    
    int arr[];
    int size=-1; 

    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(size==arr.length-1) return;
        arr[++size]=x;
    }
    
    public int pop() {
        if(size==-1){
          return size;
        }
        return arr[size--];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k;i++){
            if(size+1==i) return;
            arr[i]=arr[i]+val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */