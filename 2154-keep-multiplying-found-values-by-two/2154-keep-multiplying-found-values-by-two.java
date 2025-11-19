class Solution {
    public int findFinalValue(int[] nums, int original) {
        for (int a : nums) {
            if (a == original) {
                original *= 2;
            }
        }
        return original;
    }
}