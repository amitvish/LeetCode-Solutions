class Solution {

    public int characterReplacement(String s, int k) {
        int alphabets[] = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            alphabets[rightChar - 'A']++;
            maxFreq = Math.max(maxFreq, alphabets[rightChar - 'A']);
            // when to shrink the window
            while (right - left + 1 - maxFreq > k) {
                char leftChar = s.charAt(left);
                alphabets[leftChar - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
