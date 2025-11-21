class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
       HashSet<Integer> hs = new HashSet();
       for (int i : nums) {
        hs.add(i);
       } 
       HashSet<Integer> hs1 = new HashSet();
      for (int i : nums) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (i == nums[j]) count++;
        }
        if (count > n / 3) hs1.add(i);
       }
       List<Integer> list = new ArrayList(hs1);
       return list;
    }
}