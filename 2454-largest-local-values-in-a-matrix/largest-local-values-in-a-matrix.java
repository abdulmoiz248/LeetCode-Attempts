class Solution {
     public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] arr=new int[n-2][n-2];
         for(int i=0;i<grid.length-2;i++)
             for(int j=0;j<grid[0].length-2;j++){
                 arr[i][j]=max(grid,i,j);
             }
       return arr;
    }
    public int max(int[][] arr,int row,int col){
      int breaker=0;
      int column=col;
      int max=arr[row][col];
      for(int i=row;i<row+3;i++){
           System.out.println("I="+i+ "Col ="+ col+ "IN LOOP OUT MAX="+max);
           if(column+3==col) break;
          max=Math.max(max,arr[i][col]);
           
          breaker++;
          if(breaker==3){
              i=row-1;
              col++;
              breaker=0;
          }
          
      }
         System.out.println("YAHA BARI KHATAM");
      return max;
    }
}