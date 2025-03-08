class Solution {

    public int minimumRecolors(String blocks, int k) {
        int countW = 0;
        int n = blocks.length();
        int minCount = Integer.MAX_VALUE;
        //make a window of k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
        }
        minCount = Math.min(countW, minCount);
        //sliding window across the screen
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') {
                countW--;
            }
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
            minCount = Math.min(countW, minCount);
        }
        return minCount;
    }
}
