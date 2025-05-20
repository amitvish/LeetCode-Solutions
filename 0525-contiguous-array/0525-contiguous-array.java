class Solution {

    public int findMaxLength(int[] nums) {
        //change 0 to 1
        //take prefix sum
        //define hashmap and save sum and index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        HashMap<Integer, Integer> sumToIndexMap = new HashMap<>();
        int result = 0;
        sumToIndexMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (!sumToIndexMap.containsKey(nums[i])) {
                sumToIndexMap.put(nums[i], i);
            }
            result = Math.max(result, i - sumToIndexMap.get(nums[i]));
        }
        return result;
    }
}
