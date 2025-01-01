class Solution {

    public int maxScore(String s) {
        int initialZero = 0;
        int initialOne = 0;
        int sum = 0;
        for (char c : s.toCharArray()) {
            initialOne += c - '0';
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '0') initialZero++; else {
                initialOne--;
            }
            sum = Math.max(sum, initialZero + initialOne);
        }
        return sum;
    }
}
