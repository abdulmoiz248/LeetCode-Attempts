class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int total_bottles=numBottles;
 while (true) {
            int exchange = total_bottles / numExchange;
            total_bottles=exchange+total_bottles % numExchange;
            total += exchange;
            if(total_bottles < numExchange)
               return total;

        }
    }
}