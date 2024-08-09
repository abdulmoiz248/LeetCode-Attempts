class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length<3 || grid[0].length<3) return 0;

        int total=0;
        for(int row=0;row+2<grid.length;row++){
            for(int col=0;col+2<grid[0].length;col++){
               if(magic(grid,row,col)) total++;
            }
        }
        return total;    
    }

    private boolean magic(int[][] grid,int row,int col){
        int sum=0;
       Set<Integer> seen = new HashSet<>();
        for(int i=row;i<row+3;i++){
            int temp_sum=0;
            for(int j=col;j<col+3;j++){
               if(grid[i][j]<1 || grid[i][j]>9 || !seen.add(grid[i][j])) return false;
                 seen.add(grid[i][j]);
                temp_sum+=grid[i][j];
            }
            if(sum==0){
                sum=temp_sum;
            }else{
                if(sum!=temp_sum)
                  return false;
            } 
        }

         for(int i=col;i<col+3;i++){
            int temp_sum=0;
            for(int j=row;j<row+3;j++){
                 if(grid[j][i]<1 || grid[j][i]>9) return false;
                temp_sum+=grid[j][i];
            }
            
                if(sum!=temp_sum)
                  return false;
             
        }

        if(grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2]!=sum)
             return false;

        if(grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col]!=sum)
             return false;



        return true;          

             
             

    }
}