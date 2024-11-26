class Solution {

    public int[][] merge(int[][] intervals) {
        //edge case
        if (intervals.length <= 1) return intervals;
        //sort the intervals
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        //store first element
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                //merge
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                //disjoint set
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
