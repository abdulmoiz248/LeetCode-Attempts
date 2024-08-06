class Solution {
    public int minimumPushes(String word) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(char c:word.toCharArray()){
        if(map.containsKey(c))
            map.replace(c,map.get(c)+1);
        else 
           map.put(c,1);        
       } 
        
       PriorityQueue<Integer> q=new PriorityQueue<>(
        (a,b)->b-a
       ); 
       
       q.addAll(map.values());
       int index=0;
       int total=0;

       while(!q.isEmpty()){
       total+=(index++/8+1)*q.poll();
       }  

return total;
    }
}