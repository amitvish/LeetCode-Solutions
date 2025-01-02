class Solution {

    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int n = words.length;
        int[] wordHasVowel = new int[n];
        for (int i = 0; i < n; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (vowels.contains(first) && vowels.contains(last)) {
                wordHasVowel[i] = 1;
            }
        }
        // Step 3: Compute prefix sum array
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + wordHasVowel[i];
        }

        // Step 4: Answer queries using prefix sum
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefixSum[end + 1] - prefixSum[start];
        }
        return result;
    }
}
