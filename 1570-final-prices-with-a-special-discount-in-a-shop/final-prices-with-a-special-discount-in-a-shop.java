class Solution {
    public int[] finalPrices(int[] prices) {
        
       int index=1; 
       for(int i=0;i<prices.length-1;i++){
        if(index<prices.length && prices[i]<prices[index]){
            index++;
            if(index==prices.length) {
                index=i+2;
                continue;
            }
            i--;
        }else{
            prices[i]-=prices[index];
            index=i+2;
        }
       }

        return prices;
    }
}