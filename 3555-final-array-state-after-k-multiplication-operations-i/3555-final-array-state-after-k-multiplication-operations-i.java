class Solution {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int minIndex;
        while (k > 0) {
            minIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            nums[minIndex] = nums[minIndex] * multiplier;
            k--;
        }
        return nums;
    }
}
