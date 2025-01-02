class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0);
    }

    private int helper(int[] nums, int target, int index) {
        if (index == nums.length) {
            if (target == 0) {
                return 1;
            } else return 0;
        }

        int take = helper(nums, target - nums[index], index + 1);
        int noTake = helper(nums, target + nums[index], index + 1);

        return take + noTake;
    }
}
