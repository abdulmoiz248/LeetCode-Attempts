class Solution {
  public int matrixScore(int[][] grid) {
       for (int row=0;row<grid.length;row++){
           if(grid[row][0]==0) fliprow(grid,row);
       }
        for (int col=0;col<grid[0].length;col++){
            int ones=0;
            for (int row=0;row<grid.length;row++){
                if(grid[row][col]==1) ones++;
            }
            if(ones*2 <=grid.length) flipcol(grid,col);
        }
       int max=0;
        for (int i=0;i<grid.length;i++)
            max+=conversion(grid,i);
        return max;
    }

    private void fliprow(int[][] arr,int row){
        for(int i=0;i<arr[0].length;i++){
            if(arr[row][i]==0) arr[row][i]=1;
            else arr[row][i]=0;
        }
    }
    private void flipcol(int[][] arr,int col){
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]==0) arr[i][col]=1;
            else arr[i][col]=0;
        }
    }
    private int conversion(int[][] arr,int row){
        int answer=0;
        for(int i=0;i<arr[0].length;i++){
            answer=answer*2+arr[row][i];
        }
return answer;
    }
    
}