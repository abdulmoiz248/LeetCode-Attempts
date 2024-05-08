class Solution {
     public String[] findRelativeRanks(int[] score) {
        String str[]=new String[score.length];
        for(int j=0;j<score.length;j++) {
            int largers = 0;
            for (int i = 0; i < score.length ; i++) {


                if (score[j] < score[i]) {
                    largers++;
                }

                if (largers == 0) {
                    str[j] = "Gold Medal";
                } else if (largers == 1) {
                    str[j] = "Silver Medal";
                } else if (largers == 2) {
                    str[j] = "Bronze Medal";
                } else {
                    str[j] = "";
                    str[j] += largers+1;
                }
            }
        }
         return str;
    }

}