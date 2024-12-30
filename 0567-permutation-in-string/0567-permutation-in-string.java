class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int i = 0;
        int j = i + n;
        while (j <= s2.length()) {
            String current = s2.substring(i, j);
            if (isPermutation(s1, current)) {
                return true;
            }
            i++;
            j = i + n;
        }
        return false;
    }

    private boolean isPermutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false; // Permutations must have the same length
    }

    int[] charCount = new int[26]; // Assuming lowercase English letters

    // Count characters in s1
    for (char c : s1.toCharArray()) {
        charCount[c - 'a']++;
    }

    // Subtract character counts based on s2
    for (char c : s2.toCharArray()) {
        charCount[c - 'a']--;
        if (charCount[c - 'a'] < 0) {
            return false; // More occurrences in s2 than s1
        }
    }

    // If all counts are zero, s1 and s2 are permutations
    return true;
}

}
