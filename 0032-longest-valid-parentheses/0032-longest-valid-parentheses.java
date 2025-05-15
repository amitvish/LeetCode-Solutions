class Solution {

    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int n = s.length();
        //left to right pass
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') left++; else right++;
            if (right == left) maxLen = Math.max(maxLen, 2 * right); 
            else if (right > left) right = left = 0;
        }
        left = right = 0;

        //right to left pass
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') left++; else right++;
            if (right == left) maxLen = Math.max(maxLen, 2 * right); 
            else if (right < left) right = left = 0;
        }
        return maxLen;
    }
}
