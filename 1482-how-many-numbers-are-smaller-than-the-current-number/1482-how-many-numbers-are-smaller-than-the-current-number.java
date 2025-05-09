class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sortedNums[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        // 8, 1, 2, 2, 3
        // 1, 2, 2, 3, 8
        int output[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == sortedNums[j]) {
                    output[i] = j;
                    break;
                }
            }
        }

        return output;
    }
}
