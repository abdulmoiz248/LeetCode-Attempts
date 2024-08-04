class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        if(right<left) return 0;

        ArrayList<Integer> arr=new ArrayList<>();
        int mod = (int) 1e9 + 7;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            int temp_sum=0;
            for(int j=i;j<nums.length;j++){
             temp_sum+=nums[j];
              arr.add(temp_sum);
            }     
           
        }

        Collections.sort(arr);

        for(int i=left-1;i<right;i++)
             sum=(sum+arr.get(i))%mod;
        return sum;      

    }
}