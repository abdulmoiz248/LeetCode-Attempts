class Solution {
   public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.replace(c,map.get(c)+1);
            }else map.put(c,1);
        }

        int count=0;
        boolean single=false;
       
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() % 2 == 0) {
            count += entry.getValue();
        } else {
            count += entry.getValue() - 1;
            single = true;
        }
    
        }
        if(single){
            return count+1;
        }
        return count;
    }
}