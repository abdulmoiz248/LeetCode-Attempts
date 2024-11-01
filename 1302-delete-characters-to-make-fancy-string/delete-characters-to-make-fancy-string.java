class Solution {
    public String makeFancyString(String s) {
        StringBuilder newStr = new StringBuilder();
        char prev = ' ';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                count = 1;
                prev = s.charAt(i);
            }
            if (count < 3) {
                newStr.append(s.charAt(i));
            }
        }
        
        return newStr.toString();
    }
}
