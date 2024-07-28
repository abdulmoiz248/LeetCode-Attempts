class Solution {
    public int lastStoneWeight(int[] stones) {
     if(stones.length==1) return stones[0];   
       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
       for(int n:stones)
           pq.add(n);

        while(!pq.isEmpty()){
            int first=pq.poll();
            if(pq.peek()==null) return first;
            int second=pq.poll();
            pq.add(Math.abs(first-second));
        }   
        return pq.peek();
     
    }
}