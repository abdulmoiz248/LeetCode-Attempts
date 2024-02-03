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

    public int longestConsecutive(int[] nums) { //time limit issue
        if(nums.length==0 ) return 0;
        if(nums.length==1) return 1;
        int min=find_min(nums);
        int length=0;
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        while (!set.isEmpty()){
            if(!(set.contains(min))){
                Iterator<Integer> iterator=set.iterator();
                int arr[]=new int[set.size()];
                int i=0;
                while (iterator.hasNext()){
                    arr[i]=iterator.next();
                    i++;
                }
                int l2= longestConsecutive(arr);
                if(l2<length) return length;
                return l2;
            }else{
                set.remove(min);
                min++;
                length++;
            }
        }
        return length;
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

      for (int grid=0;grid<9;grid++){

      }

    }
    private boolean verify_grid(int rows,int cols,int rowe,int cole,char[][] board){
        for(int row=rows;row<rowe;row++){
            HashSet<Character> rowset=new HashSet<>();
            for(int col=cols;col<cole;col++){
                char temp=board[row][col];
                if(temp!='.'){
                    if(rowset.contains(temp)) return false;
                    rowset.add(temp);
                }
            }
        }
        return true;
    }

   /* wrong 1,2,1
   public  int maxArea(int[] height){
        int area=0;
        int max_index=find_max(height);
        for (int i=0;i<height.length;i++){
            int width=Math.abs(max_index-i);
            if(area<width*height[i]) area=width*height[i];
        }
        return area;
    }
    private int find_max(int[] height){
        int max=0;
        for (int i=0;i<height.length;i++){
           if(height[max]<height[i]) max=i;
        }
        return max;
    }*/


}
