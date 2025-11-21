class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       HashSet<Integer> hs = new HashSet();
       for (int i : nums) {
        hs.add(i);
       } 
       int ans = 0;
       int res = 0;
       for (int i : nums) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (i == nums[j]) count++;
        }
       if (count > ans) {
        ans = count;
        res = i;
        if (ans >= n / 2 + 1) return i;
       }
       }
       if (ans >= n / 2) return res;
       return 0;
    }
}