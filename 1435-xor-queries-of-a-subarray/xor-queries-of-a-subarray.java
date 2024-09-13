class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++){
          int xor=0;
          for(int j=queries[i][0];j<=queries[i][1];j++){
            xor^=arr[j];
        }
        result[i]=xor;
        }
        return result;
 
    }
}