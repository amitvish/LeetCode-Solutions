class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        int start = 0;
        int windowLength = Integer.MAX_VALUE;

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);
            while (areMapsElementsInAnother(tMap, window)) {
                if (windowLength > right - left + 1) {
                    windowLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                left++;
            }
            right++;
        }
        return windowLength == Integer.MAX_VALUE ? "" : s.substring(start, start + windowLength);
    }

    public static boolean areMapsElementsInAnother(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            // Check if the key exists in map2 and if the value matches
            if (!map2.containsKey(key) || map2.get(key) < value) {
                return false;
            }
        }
        return true;
    }
}
