class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1;
        int high = piles[piles.length - 1];
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countHours(piles, mid, h)) high = mid; else low = mid + 1;
        }
        return low;
    }

    private boolean countHours(int[] piles, int speed, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (int) Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}
