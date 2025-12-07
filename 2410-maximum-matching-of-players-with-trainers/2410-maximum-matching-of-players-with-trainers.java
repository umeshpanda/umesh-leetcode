class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        ArrayList<Integer> list = new ArrayList();
        for (int i : trainers) {
            list.add(i);
        }
        Collections.sort(list);
        int count = 0;

        for (int i : players) {
            for (int j = 0; j < list.size(); j++) {
                if (i <= list.get(j)) {
                    count++;
                    list.remove(j);
                    break;
                }
            }
        }
        return count;
    }
}