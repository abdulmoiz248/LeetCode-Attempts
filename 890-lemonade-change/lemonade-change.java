class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int twenty=0;
        int five=0;

        for(int bill:bills){
            if(bill==5) five++;
            else if(bill==10){
                five--;
                ten++;
                if(five<0) return false;
            }else{
                if(five>0 && ten>0){
                    ten--;
                    five--;
                    twenty++;
                }
                else if(five<3 ) return false;
                else {
                    five-=3;
                }

                
            }
          
        }
          return true;
    }
}