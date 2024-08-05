class Solution {
  
    public String kthDistinct(String[] arr, int k) {

        HashMap <String,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.replace(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                k--;
            }
            
            if(k==0){
                return arr[i];
            }
        }
        return "";
    }
}