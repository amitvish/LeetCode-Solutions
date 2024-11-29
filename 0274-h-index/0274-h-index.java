class Solution {

    public int hIndex(int[] citations) {
        int n = citations.length;
        int paperCount[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (citations[i] <= n) {
                paperCount[citations[i]]++;
            } else paperCount[n]++;
        }
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += paperCount[i];
            if (sum >= i) {
                return i;
            }
        }
        return 0;
    }
}
