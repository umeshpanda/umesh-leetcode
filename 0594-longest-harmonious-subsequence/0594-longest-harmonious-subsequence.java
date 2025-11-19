class Solution {
    public int findLHS(int[] nums) {
     int l = 0, r = 0;
     int maxlen = 0;
     int count = 0;
    Arrays.sort(nums);
     while (r < nums.length) {
        if (nums[r] - nums[l] == 1) {
            count = r - l + 1;
            maxlen = Math.max(maxlen, count);
        } 
         if (nums[r] - nums[l] <= 1) {
            r++;
        } else {
            l++;
        }
     } 
     return maxlen;  
    }
}