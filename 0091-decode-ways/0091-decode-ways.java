class Solution {

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int n = s.length();
        int waysToDecode[] = new int[n + 1];
        waysToDecode[0] = 1;
        waysToDecode[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            if (isValid(s.charAt(i - 1) - '0')) {
                waysToDecode[i] += waysToDecode[i - 1];
            }
            if ((s.charAt(i - 2) - '0' != 0) && (isValid(10 * (s.charAt(i - 2) - '0') + s.charAt(i - 1) - '0'))) {
                waysToDecode[i] += waysToDecode[i - 2];
            }
        }
        return waysToDecode[n];
    }

    public boolean isValid(int n) {
        if (n == 0 || n > 26) return false;
        return true;
    }
}
