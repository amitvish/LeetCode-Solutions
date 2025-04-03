class Solution {

    public long maximumTripletValue(int[] nums) {
        long result = 0;
        if (nums.length < 3) return result;

        int maxLeft = nums[0];
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length - 1; i++) {
            maxDiff = Math.max(maxDiff, maxLeft - nums[i]);
            result = Math.max(result, (long) maxDiff * nums[i + 1]);
            maxLeft = Math.max(maxLeft, nums[i]);
        }

        return result;
    }
}
