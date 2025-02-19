class Solution {

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return gcd(min, max);
    }

    private int gcd(int min, int max) {
        if (min == 0) return max;
        return gcd(max % min, min);
    }
}
