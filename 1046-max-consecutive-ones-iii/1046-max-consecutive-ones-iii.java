class Solution {

    public int longestOnes(int[] nums, int k) {
        int i = 0; //left pointer
        int j = 0; //right pointer
        int maxSum = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (nums[i] == 0) {
                    k++;
                }
                i++;
            }
            maxSum = Math.max(maxSum, j - i + 1);
            j++;
        }
        return maxSum;
    }
}
