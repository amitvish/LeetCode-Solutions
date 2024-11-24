class Solution {

    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String balloon = "balloon";
        int minCount = Integer.MAX_VALUE;
        for (char c : balloon.toCharArray()) {
            if (map.containsKey(c)) {
                int requiredCount = c == 'l' || c == 'o' ? map.get(c) / 2 : map.get(c);
                minCount = Math.min(minCount, requiredCount);
            } else {
                return 0;
            }
        }
        return minCount;
    }
}
