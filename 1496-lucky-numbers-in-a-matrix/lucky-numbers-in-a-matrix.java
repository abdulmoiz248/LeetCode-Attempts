class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> minl=new ArrayList<>();
        List<Integer> maxl=new ArrayList<>();

     for(int i=0;i<matrix.length;i++){
        int min=Integer.MAX_VALUE;;
         for(int j=0;j<matrix[0].length;j++){
           min=Math.min(min,matrix[i][j]);
        }
       minl.add(min);
        }

for(int i=0;i<matrix[0].length;i++){
        int max=Integer.MIN_VALUE;;
         for(int j=0;j<matrix.length;j++){
           max=Math.max(max,matrix[j][i]);
        }
       maxl.add(max);
        }
        List<Integer> returnl=new ArrayList<>();
        for(int x:minl){
            if(maxl.contains(x)) returnl.add(x);
            System.out.println(x);
        }
        return returnl;
    }
}