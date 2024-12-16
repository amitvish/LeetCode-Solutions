class Solution {

    public int jump(int[] nums) {
        //DO using greedy
        int jump = 0;
        int farthest = 0;
        int currentEnd = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int farLimit = Math.min(i + nums[i], nums.length - 1);
            farthest = Math.max(farthest, farLimit);
            if (i == currentEnd) {
                jump++;
                currentEnd = farthest;
            }
        }
        return jump;
    }
}
