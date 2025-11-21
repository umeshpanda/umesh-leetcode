class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
          int n = nums.length;
       HashSet<Integer> hs = new HashSet();
       for (int i : nums) {
        hs.add(i);
       } 
       int most = 0;
       int res = -1;
      for (int i : nums) {
        int count = 0;
        if (i % 2 == 0) {
        for (int j = 0; j < n; j++) {
            if (i == nums[j]) count++;
        }
        if (count > most) {
            most = count;
            res = i;
        }
        }
        
       }
       return res;
    }
}