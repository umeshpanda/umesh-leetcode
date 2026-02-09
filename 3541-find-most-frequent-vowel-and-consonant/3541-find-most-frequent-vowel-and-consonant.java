class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int vowelMax = 0;
        int consMax = 0;
       for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if ("AEIOUaeiou".indexOf(entry.getKey()) > 0) {
                vowelMax = Math.max(vowelMax, entry.getValue());
            } else {
                consMax = Math.max(consMax, entry.getValue());
            }
       }
       return vowelMax + consMax;
    }
}