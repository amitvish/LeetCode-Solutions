class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> memo = new HashMap<>();
        return helper(nums, target, 0, memo);
    }

    private int helper(int[] nums, int target, int index, HashMap<String, Integer> memo) {
        if (index == nums.length) {
            if (target == 0) {
                return 1;
            } else return 0;
        }
        String key = index + "," + target;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int take = helper(nums, target - nums[index], index + 1, memo);
        int noTake = helper(nums, target + nums[index], index + 1, memo);
        memo.put(key, take + noTake);

        return take + noTake;
    }
}
