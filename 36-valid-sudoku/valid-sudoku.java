class Solution {
     public boolean isValidSudoku(char[][] board) {

     //checking row
       for(int row=0;row<9;row++){
           HashSet<Character> rows=new HashSet<>();
           for(int col=0;col<9;col++){
               char temp=board[row][col];
               if(temp!='.'){
                 if(rows.contains(temp)) return false;
                 rows.add(temp);
               }
           }
       }
//checking col
        for(int col=0;col<9;col++) {
            HashSet<Character> cols=new HashSet<>();
            for(int row=0;row<9;row++){
                char temp=board[row][col];
                if(temp!='.'){
                    if(cols.contains(temp)) return false;
                    cols.add(temp);
                }
            }
        }
//checking grid
          if(!(verify_grid(0,3,0,3,board) ))
              return false;
        if(!(verify_grid(0,3,3,6,board) ))
            return false;
        if(!(verify_grid(0,3,6,9,board) ))
            return false;

        if(!(verify_grid(3,6,0,3,board) ))
            return false;
        if(!(verify_grid(3,6,3,6,board) ))
            return false;
        if(!(verify_grid(3,6,6,9,board) ))
            return false;

        if(!(verify_grid(6,9,0,3,board) ))
            return false;
        if(!(verify_grid(6,9,3,6,board) ))
            return false;
        if(!(verify_grid(6,9,6,9,board) ))
            return false;
return true;
    }
    private boolean verify_grid(int rowstart,int rowend,int colstart,int colend,char[][] board){
        HashSet<Character> grid=new HashSet<>();
        for(int i=rowstart;i<rowend;i++){
          for(int j=colstart;j<colend;j++){
              char temp=board[i][j];
              if(temp!='.'){
                  if(grid.contains(temp)) return false;
                  grid.add(temp);
              }
          }
        }
        return true;
    }
}