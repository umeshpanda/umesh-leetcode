class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        int count = 0;
        int s = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            s += i;
            int var = Math.abs(s - (sum - s));
            if (var % 2 == 0) count++;
        }
        return count;
    }
}