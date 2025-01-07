class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        //sort based on end times
        //if overlapping remove interval with greater end
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        //interval we wanna keep
        int count = 1;

        int previous = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[previous][1]) {
                previous = i;
                count++;
            }
        }
        return intervals.length - count;
    }
}
