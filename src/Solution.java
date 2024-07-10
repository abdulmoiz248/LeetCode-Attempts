import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return null;
    }
    public static int[] twoSum_sortedarray(int[] numbers, int target) {

        for(int i=0;i< numbers.length;i++)
        {
            int j=(i+numbers.length)/2;
            {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{i + 1, j + 1};
                else if (numbers[i] + numbers[j] < target) {
                    for(int k=j+1;k< numbers.length;k++){
                        if (numbers[i] + numbers[k] == target)
                            return new int[]{i + 1, k + 1};
                    }
                }else {
                    for(int k=i+1;k<j;k++)
                        if (numbers[i] + numbers[k] == target)
                            return new int[]{i + 1, k + 1};
                }
            }
        }
        return null;
    }
    public static boolean isPalindrome(String s) {
        s.trim();
        s.toLowerCase();
        String temp="";
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        for (int i=0;i< s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            temp += stack.peek();
            stack1.push(stack.pop());
        }

        s="";
        while (!stack1.isEmpty()){
            s+=stack1.pop();
        }


        return temp.toLowerCase().equals(s.toLowerCase());
    }

    public static int[] productExceptSelf(int[] nums) {
        int prod[]=new int[nums.length];
        int total=1;
        for(int i=0;i<nums.length;i++)
            total*=nums[i];
        for(int i=0;i<nums.length;i++)
        {
            try{
                prod[i]=total/nums[i];
            }catch (ArithmeticException e){
                int zerocase=1;
                for(int j=0;j<nums.length;j++)
                    if(i!=j)
                        zerocase*=nums[j];
                prod[i]=zerocase;
            }
        }
        return prod;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.replace(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        int arr[][]=fillarray(map);

        for (int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++)
                if(arr[i][0]<arr[j][0])
                {
                    int temp1=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=temp1;

                    temp1=arr[i][1];
                    arr[i][1]=arr[j][1];
                    arr[j][1]=temp1;
                }
        }
        int kelement[]=new int[k];
        for(int i=0;i<kelement.length;i++)
        {
            kelement[i]=arr[i][1];
        }
        return kelement;
    }
    private static int[][] fillarray(HashMap<Integer,Integer> map){
        int arr[][]=new int[map.size()][2];
        int i=0;
        for (Map.Entry entry:map.entrySet()){
            arr[i][1]= (int) entry.getKey();
            arr[i][0]= (int) entry.getValue();
            i++;
        }
        return arr;
    }


    public  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i)))
                map.replace(t.charAt(i),map.get(t.charAt(i))-1);
            else return false;
        }
        for(int i=0;i< map.size();i++){

            if(map.get(s.charAt(i))!=0)
                return false;
        }
        return true;
    }

    public int lengthOfLongestSubstring(String s) {
       if(s==null || s.equals("")) return 0;
       if(s.equals(" ") || s.length()==1) return 1;

       int length=0;
       int final_length=0;
       HashSet<Character> set=new HashSet<>();

       for (int i=0;i<s.length();i++){
           if(set.contains(s.charAt(i))){
                set=new HashSet<>();

                final_length=Math.max(final_length,length);
                length=1;

                for (int j=i-1;j>=0;j--){
                    if(s.charAt(i)==s.charAt(j)) {
                        i=j+1;
                        break;
                    }
                }
                set.add(s.charAt(i));
           }else {
               set.add(s.charAt(i));
               length++;
           }
       }
        System.out.println();
       return Math.max(final_length,length);
    }


    public int longestConsecutive(int[] nums){

        if(nums.length==0) return 0;
        if(nums.length==1) return 1;

        Arrays.sort(nums);

        int ptr=nums[0];
        int length=1;
        int final_length=0;
        for (int i=1;i<nums.length;i++){
            if(ptr!=nums[i]){
                if(ptr+1==nums[i]){
                    length++;
                }else {
                    final_length=Math.max(final_length,length);
                     length=1;
                }
            }
            ptr=nums[i];
        }
        return Math.max(final_length,length);
    }

    private int find_min(int[] nums){
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
        }
        return min;
    }
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
    public int search(int[] nums, int target) {
        int index=(nums.length-1)/2;
        if(nums[index]==target) return index;
        else if(nums[index]>target) {
             for(int i=0;i<index;i++){
                 if(nums[i]==target) return i;
             }
        }else {
            for (int i=index+1;i<nums.length;i++){
                if(nums[i]==target) return i;
            }
        }
        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int index=matrix.length;
        for (int i=1;i<matrix.length;i++){
            if(matrix[i][0]>target) {
                index = i-1;
                break;
            }
        }
        System.out.println(index);
      for (int i=0;i<matrix[1].length;i++){
          if(matrix[index][i]==target) return true;
      }
      return false;
    }
    public static List<List<Integer>> threeSum(int[] nums){ //tome limit
         Arrays.sort(nums);
         List<List<Integer>> lists=new ArrayList<>();
         for (int i=0;i<nums.length-2;i++){
             int j=i+1;
             int k= nums.length-1;
             while (k>j)
             {
                 if(nums[i]+nums[k]+nums[j]==0){
                     List<Integer> l=new ArrayList<>();
                     l.add(nums[i]);
                     l.add(nums[j]);
                     l.add(nums[k]);
                     if(!lists.contains(l)) lists.add(l);
                 }else if (nums[i]+nums[k]+nums[j]>0){
                     k--;
                 }else j++;
             }
         }
         return lists;
    }
    public int hammingWeight(int n) {
      if(n==0) return 0;
      if(n%2==0){
          return hammingWeight(n/2);
      }else  return hammingWeight(n/2)+1;
    }

    public int[] plusOne(int[] digits) {
       if(digits.length==0) return null;
       int index=digits.length-1;
       return checkcondition(digits,index);
    }
    private int[] checkcondition(int[] digits,int index){
        if(index==-1){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            for (int i=1;i<arr.length;i++){
                arr[i]=0;

            }
            for (int i=0;i<arr.length;i++) System.out.println(arr[i]);
            return arr;
        }
        if(digits[index]==9){
            digits[index]=0;
           return checkcondition(digits,index-1);
        }else{
            digits[index]+=1;
        }
        return digits;
    }
    public int removeElement(int[] nums, int val) {
     if(nums.length==1 && nums[0]==val) return 0;
     int total=nums.length;
     for(int i=0;i<nums.length;i++){
         if(i==total){
             return total;
         }
         if(nums[i]==val){
             if(nums[total-1]==val){
                 total--;
                 i=i-1;
                 continue;
             }
             total--;
             nums[i]=nums[total];
         }
     }
     return total;
    }
    public String[] findRelativeRanks(int[] score) {
        String str[]=new String[score.length];
        for(int j=0;j<score.length;j++) {
            int largers = 0;
            for (int i = 0; i < score.length - 1; i++) {


                if (score[j] < score[i]) {
                    largers++;
                }

                if (largers == 0) {
                    str[j] = "Gold Medal";
                } else if (largers == 1) {
                    str[j] = "Silver Medal";
                } else if (largers == 2) {
                    str[j] = "Bronze Medal";
                } else {
                    str[j] = "";
                    str[j] += largers+1;
                }
            }
        }
         return str;
    }
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum=0;
        for(int i=0;i<k;i++){
            int no=findlargestindex(happiness);
          if(happiness[no]-i>0)
               sum=sum+(happiness[no]-i);
            System.out.println("Happiness="+happiness[no]+" K="+i+" Sum="+sum);
            happiness[no]=0;
        }
        return sum;
    }
    private int findlargestindex(int[] arr){
        int large=0;
        for(int i=1;i<arr.length;i++){
            if(arr[large]<=arr[i]){
                large=i;
            }
        }
        return large;
    }

    public int[][] largestLocal(int[][] grid) {
        int[][] arr=new int[grid.length-2][grid[0].length];
         for(int i=0;i<grid.length-2;i++)
             for(int j=0;j<grid[0].length-2;j++){
                 arr[i][j]=max(grid,i,j);
             }
       return arr;
    }
    public int max(int[][] arr,int row,int col){
      int breaker=0;
      int max=arr[row][col];
      int x=row;

      while (true){
          if(breaker==3) break;

          Math.max(max,arr[x][col]);
          row++;
          if(breaker==2){
              
          }
      }
      return max;
    }
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
            max=Math.max(max,conversion(grid,i));
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

        if(row<0 || col<0 || grid[row][col]==0 || col>=grid[0].length || row>=grid.length)
            return 0;
        int temp=grid[row][col];
        grid[row][col]=0;

        int move=Math.max(Math.max(tracking(grid,row-1,col),tracking(grid,row+1,col)),Math.max(tracking(grid,row,col+1),tracking(grid,row,col-1)));

        grid[row][col]=temp;
        return temp+move;
    }
  public String reverseVowels(String s) {
        Stack stack=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='u' || s.charAt(i)=='o' || s.charAt(i)=='A' || s.charAt(i)=='I' || s.charAt(i)=='E' || s.charAt(i)=='U' || s.charAt(i)=='O'){
                stack.push(s.charAt(i));
            }
        }
        String newS=new String(); 
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='u' || s.charAt(i)=='o' || s.charAt(i)=='A' || s.charAt(i)=='I' || s.charAt(i)=='E' || s.charAt(i)=='U' || s.charAt(i)=='O'){   
                newS+= (char) stack.pop();
            }else
            {
              newS+=s.charAt(i);  
            }
            
            }
        
        return newS;
    }
    
    
}
