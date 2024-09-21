class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<10;i++){
           generate(i,n,list);
        }
        return list;

    }
    public void generate(int i,int n,List<Integer>  list){
        if(i>n) return;
         list.add(i);
         for(int j=0;j<10;j++){
            if(n<i*10+j){
                return;
            }
            generate(i*10+j,n,list);
         }
         return;
    }
    
}