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
        LinkedList.ListNode l1=null;
        l=  list.insert(9,l);
        l=  list.insert(4,l);
        l=  list.insert(2,l);
        list.print(l);

        System.out.println(list.coversion_to_int(l));

     //   System.out.println(solution.maximumHappinessSum(new int[]{2135218,73431904,92495076,77528042,82824634,3036629,28375907,65220365,40948869,58914871,57169530,89783499,19582915,19676695,11932465,21770144,49740276,22303751,80746555,97391584,95775653,43396943,47271136,43935930,59643137,64183008,8892641,39587569,85086654,5663585,82925096,24868817,95900395,48155864,74447380,7618448,63299623,91141186,33347112,81951555,52867615,92184410,7024265,85525916,29846922,59532692,47267934,6514603,1137830,97807470},41));

    }

}