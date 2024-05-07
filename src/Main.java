import org.w3c.dom.NodeList;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
   /*  //   System.out.println(solution.longestConsecutive(new int[]{100,4,200,1,3,2}));
        char[][] board = new char[9][9];
        String[][] inputArray = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = inputArray[i][j].charAt(0); // Assuming input is always a single character or a dot
            }
        }

        System.out.println(solution.isValidSudoku(board));*/
     /*   LinkedList list=new LinkedList();
        LinkedList.ListNode l=null;
        LinkedList.ListNode l1=null;
        l=  list.insert(3,l);
        l=  list.insert(4,l);
        l=  list.insert(2,l);

        l1=  list.insert(4,l);
        l1=  list.insert(6,l);
        l1=  list.insert(5,l);
        list.print(l);*/

       // System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
       // System.out.println(solution.longestConsecutive(new int[]{-7,2,-3,8,9,0,8,4,-5,8,-5,-5,1,6,4}));
      //  System.out.println(solution.maxArea(new  int []{1,8,6,2,5,4,8,3,7}));

       // System.out.println(solution.minWindow("ADOBECODEBANC","ABC"));
        LinkedList list=new LinkedList();
        LinkedList.ListNode l=null;
        l=  list.insert(9,l);
        l=  list.insert(8,l);
        l=  list.insert(1,l);
        list.print(l);
        list.doubleIt(l);
        System.out.println("After");
        list.print(l);
    }
}