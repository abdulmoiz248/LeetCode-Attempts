class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        long maxDiff = 0;
        long maxTriple = 0;

        for (int j = 1; j < nums.length - 1; j++) {
            max = Math.max(max, nums[j - 1]); 
            maxDiff = Math.max(maxDiff, max - nums[j]); 
            maxTriple = Math.max(maxTriple, maxDiff * (long) nums[j + 1]); 
        }

        return maxTriple;
    }
}
