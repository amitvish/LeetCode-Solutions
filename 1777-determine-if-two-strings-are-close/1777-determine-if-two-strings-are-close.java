import java.util.*;

class Solution {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        // Arrays to store character frequencies
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Boolean arrays to track which characters are present in each word
        boolean[] charSet1 = new boolean[26];
        boolean[] charSet2 = new boolean[26];

        // Count frequencies and track character sets
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            charSet1[c - 'a'] = true;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            charSet2[c - 'a'] = true;
        }

        // Check if both strings have the same characters
        if (!Arrays.equals(charSet1, charSet2)) {
            return false;
        }

        // Compare frequency counts
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}
