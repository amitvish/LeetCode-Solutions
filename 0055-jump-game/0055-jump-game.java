class Solution {

    public boolean canJump(int[] nums) {
        // 1, 1, 2, 5, 2, 1, 0, 0, 1, 3
        int finalPosition = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}
