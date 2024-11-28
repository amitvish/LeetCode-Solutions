class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempSet = new ArrayList<>();
        backtrack(result, tempSet, nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempSet, int[] nums, int start) {
        result.add(new ArrayList<Integer>(tempSet));
        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);
            backtrack(result, tempSet, nums, i + 1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
}
