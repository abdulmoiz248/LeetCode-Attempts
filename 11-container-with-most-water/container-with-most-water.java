class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right){
          int calarea=(right-left)*Math.min(height[left],height[right]);  
          area=Math.max(area,calarea);
          if(height[left]<height[right]){
            left++;
          }else right--;
        }
        return area;
    }
}