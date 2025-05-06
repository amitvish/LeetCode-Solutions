class Solution {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        System.out.println("m: " + m);
        System.out.println("n: " + n);
        //operation needed to convert each length of word1 to each length of word2
        int memo[][] = new int[m + 1][n + 1];
        memo[0][0] = 0;
        for (int i = 1; i < m + 1; i++) {
            memo[i][0] = i;
        }
        for (int j = 1; j < n + 1; j++) {
            memo[0][j] = j;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                //find min in top, left and diagonal
                int min = Math.min(memo[i - 1][j - 1], Math.min(memo[i - 1][j], memo[i][j - 1]));
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    memo[i][j] = memo[i - 1][j - 1];
                } else {
                    memo[i][j] = min + 1;
                }
            }
        }
        return memo[m][n];
    }
}
