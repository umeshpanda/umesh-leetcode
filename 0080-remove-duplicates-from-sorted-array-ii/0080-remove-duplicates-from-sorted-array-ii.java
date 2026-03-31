class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new TreeMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int n = entry.getValue();
            if (n > 2) {
                count += 2;
                entry.setValue(2);
            }
            else {
                count += n;
            }
        }
        int j = 0;
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int n = entry.getValue();
           for (int i = 0; i < n; i++) {
            nums[j++] = entry.getKey();
           }
        }
        return count;
    }
}