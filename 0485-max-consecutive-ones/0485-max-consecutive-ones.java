class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num > 0) {
                currCount++;
            } else {
                currCount = 0;
            }
            maxCount = Math.max(currCount, maxCount);
        }
        return maxCount;
    }
}
