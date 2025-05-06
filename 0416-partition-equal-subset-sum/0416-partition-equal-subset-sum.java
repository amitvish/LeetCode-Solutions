class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        int target = sum / 2;

        //try from left to build target
        //if we can make target rest sum is sum - target that is also target

        Boolean memo[][] = new Boolean[nums.length][target + 1];
        return canReachTarget(nums, 0, 0, target, memo);
    }

    public boolean canReachTarget(int nums[], int index, int currentSum, int target, Boolean memo[][]) {
        if (currentSum == target) return true;
        if (index >= nums.length || currentSum > target) return false;
        if (memo[index][currentSum] != null) return memo[index][currentSum];

        //choose or skip
        boolean result = canReachTarget(nums, index + 1, currentSum + nums[index], target, memo) ||
         canReachTarget(nums, index + 1, currentSum, target, memo);

        memo[index][currentSum] = result;

        return result;
    }
}
