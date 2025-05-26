class Solution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
