class Solution {

    public long coloredCells(int n) {
        if (n == 1) return 1;
        //previous plus 2^n

        return coloredCells(n - 1) + (long) (4 * (n - 1));
    }
}
