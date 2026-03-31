class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int j = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (j == k) {
                return nums[i];
            }
            j++;
        }
        return -1;
    }
}