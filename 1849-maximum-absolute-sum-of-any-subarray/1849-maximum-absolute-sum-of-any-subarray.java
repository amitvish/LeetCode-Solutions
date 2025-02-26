class Solution {

    public int maxAbsoluteSum(int[] nums) {
        int currSum = 0;
        int currMinSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int i = 0;
        while (i < nums.length) {
            currSum += nums[i];
            currMinSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            minSum = Math.min(minSum, currMinSum);
            if (currSum < 0) {
                currSum = 0;
            }
            if(currMinSum > 0){
                currMinSum = 0;
            }

            i++;
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}
