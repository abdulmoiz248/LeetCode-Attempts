class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        if(names.length==1) return names;
        String[] arr=new String[names.length];
        for(int i=0;i<names.length;i++){
            int max=0;
           for(int j=1;j<names.length;j++){
            if(heights[max]<heights[j]) max=j;
           }    
           arr[i]=names[max];
           heights[max]=0;
        }
        return arr;
    }
}