class MyHashSet {

     ArrayList<Integer> arr;
    public MyHashSet() {
        arr=new ArrayList<>();
    }
    
    public void add(int key) {
       if(contains(key)) return; 
        arr.add(key);
    }
    
   public void remove(int key) {
        if (!arr.isEmpty()) {
            int index = arr.indexOf(key);
            if (index != -1) {
                arr.remove(index);
            } else {
                System.out.println("Key not found in the list");
            }
        } else {
            System.out.println("The list is empty");
        }
    }
    
    public boolean contains(int key) {
        return arr.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */