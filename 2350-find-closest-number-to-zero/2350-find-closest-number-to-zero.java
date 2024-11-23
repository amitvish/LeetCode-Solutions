class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int closest = nums[0];
        for(int num : nums){
            if(Math.abs(num) <= Math.abs(closest)){
                closest = num;
            }
        }
        return closest;
    }
}