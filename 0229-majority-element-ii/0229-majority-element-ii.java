class Solution {

    public List<Integer> majorityElement(int[] nums) {
        //use hashmap
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) > n / 3) {
                if (!result.contains(nums[i])) {
                    result.add(nums[i]);
                }
            }
        }
        return result;
    }
}
