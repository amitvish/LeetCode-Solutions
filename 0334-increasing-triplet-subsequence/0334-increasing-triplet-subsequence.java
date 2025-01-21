class Solution {

    public boolean increasingTriplet(int[] nums) {
        //num1 < num2 < num3
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;
        int num3 = nums[0];

        for (int num : nums) {
            if (num <= num1) {
                num1 = num;
            } else if (num <= num2) {
                num2 = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
