class Solution {
    public int maxDistance(List<List<Integer>> arr) {
      int min=arr.get(0).get(0);
      int max=arr.get(0).get(arr.get(0).size()-1);
       int dis=0;
       for(int i=1;i<arr.size();i++){
        int maxL=arr.get(i).get(arr.get(i).size()-1);
        int minL=arr.get(i).get(0);
        dis=Math.max(Math.max(dis,Math.abs(maxL-min)),Math.abs(max-minL));
        max=Math.max(max,maxL);
        min=Math.min(min,minL);
       }
       return dis;
         
    }
}