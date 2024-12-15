class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1) return nums[0];
        HashSet<Integer> set=new HashSet<>();

        for(int i:nums) set.add(i);

        List<Integer> list = set.stream().sorted().collect(Collectors.toList());

 System.out.println(list);  
       if(list.size()<3) 
        return list.getLast();

        return list.get(list.size()-3);
    }
}