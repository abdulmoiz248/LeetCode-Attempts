class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefix=new HashSet<>();
        for(int i:arr1){
           while(!prefix.contains(i) && i>0){
            prefix.add(i);
            i/=10;
           }
           
        }

        int ans=0;
        for(int i:arr2){
           while(!prefix.contains(i) && i>0){
            i/=10;
           }

           if(i>0){
             ans = Math.max(ans, String.valueOf(i).length());
           }
     }        
         return ans;
    }
}