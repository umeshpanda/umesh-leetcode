class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> list = new ArrayList();
        for (int i : baskets) {
            list.add(i);
        }
        int count = 0;
        for (int i : fruits) {
            int r = -1;
            for(int j : list) {
                if (j >= i) {
                    r = j;
                    break;
                }
            }
           if (r > 0) list.remove(Integer.valueOf(r));
           else count++;
        }
        return count;
    }
}