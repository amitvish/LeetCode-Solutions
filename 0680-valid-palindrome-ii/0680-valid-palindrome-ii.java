class Solution {

    public boolean validPalindrome(String s) {
        int count = 0;
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                count++;
                if (count > 1) return false;
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int start, int end) {
        if (start == end) return true;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
