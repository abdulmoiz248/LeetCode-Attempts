class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) zero++;
            if(nums[i]==1) one++;
            if (nums[i]==2)two++;
        }
         System.out.println("Two= "+two+" one= "+one+" zero= "+zero);
        int ptr=nums.length-1;
        for(int i=0;i<two;i++) 
         {
            nums[ptr]=2;
            ptr--;
            System.out.println(ptr);
         }
         for(int i=0;i<one;i++) 
          {
            nums[ptr]=1;
            ptr--;
         }
        for(int i=0;i<zero;i++)
         {
            nums[ptr]=0;
            ptr--;
         }
        
         
    }
}