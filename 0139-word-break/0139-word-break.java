class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dictionary = new HashSet<>(wordDict);
        int maxLen = 0;
        for (String word : wordDict) {
            maxLen = Math.max(maxLen, word.length());
        }

        int n = s.length();
        boolean memo[] = new boolean[n + 1];
        memo[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (memo[j] && dictionary.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }

        return memo[n];
    }
}
