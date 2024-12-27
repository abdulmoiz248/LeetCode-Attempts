class Solution {
    public int maxScoreSightseeingPair(int[] arr) {
     int ans=Integer.MIN_VALUE;
     int max=arr[0];

     for(int i=1;i<arr.length;i++){
        if(arr[i]-i+max>ans){
            ans=arr[i]-i+max;
        } if(arr[i]+i>max){
           max=arr[i]+i;
        }
     }    

     return ans;

    }
}