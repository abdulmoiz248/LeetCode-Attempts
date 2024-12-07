class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:banned) set.add(num);

        int sum=0; 
        int count=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
               sum+=i;
               if(sum>maxSum){
                break;
               }else{
                count++;
               }
             
            }
        }
        return count;
    }
}