class Solution {
public int getMaximumGold(int[][] grid) {
        if(grid.length==0 && grid[0].length==0) return 0;
        if(grid.length==1 && grid[0].length==1) return grid[0][0];

         int max=0;
         for(int row=0;row<grid.length;row++){
             for(int col=0;col<grid[0].length;col++){
                 if(grid[row][col]!=0){
                     max=Math.max(max,tracking(grid,row,col));
                 }
             }
         }
         return max;
    }

    private int tracking(int[][] grid,int row,int col){

        if(row<0 || col<0  || col>=grid[0].length || row>=grid.length || grid[row][col]==0)
            return 0;
        int temp=grid[row][col];
        grid[row][col]=0;

        int move=Math.max(Math.max(tracking(grid,row-1,col),tracking(grid,row+1,col)),Math.max(tracking(grid,row,col+1),tracking(grid,row,col-1)));
        
        grid[row][col]=temp;
        return temp+move;
    }
}