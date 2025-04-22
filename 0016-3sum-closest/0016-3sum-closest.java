class Solution {

    public int threeSumClosest(int[] nums, int target) {
        //brute force approach O(n^3)
        int n = nums.length;
        int sum = nums[0] + nums[1] + nums[2];
        int result = sum;
        int minDiff = Math.abs(sum - target);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    int currDiff = Math.abs(sum - target);
                    if (currDiff < minDiff) {
                        minDiff = currDiff;
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
