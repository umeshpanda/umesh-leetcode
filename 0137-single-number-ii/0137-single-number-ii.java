class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        for (int i : nums) {
            hs.add(i);
        }
        for (int i : hs) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) count++;
            }
            if (count == 1) {
                return i;
            }
        }
        return 0;
    }
}