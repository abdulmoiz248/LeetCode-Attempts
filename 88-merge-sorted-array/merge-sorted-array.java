class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return ;
        if(m==0 && n!=0) {
            for(int i=0;i<n;i++)
               nums1[i]=nums2[i];
            return ;
        }
        int counter=0;   
        for(int i=m;i<nums1.length;i++){
            System.out.println(i);
            nums1[i]=nums2[counter];
            counter++;
        }
       Arrays.sort(nums1);   
    }
}