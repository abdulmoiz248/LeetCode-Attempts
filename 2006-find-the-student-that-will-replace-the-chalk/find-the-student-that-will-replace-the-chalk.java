class Solution {
    public int chalkReplacer(int[] chalk, int k) {
      long sum=0;
      for(int x:chalk)
           sum+=x;
      k%=sum;
      for(int i=0;i<chalk.length;i++){
        if(chalk[i]>k) return i;
        k-=chalk[i];
      }     
      return 0;
    }
}