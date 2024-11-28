class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, current, candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        int sum = 0;
        for (int i = 0; i < current.size(); i++) {
            sum += current.get(i);
        }
        if (sum == target) {
            result.add(new ArrayList<>(current));
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum + candidates[i] > target) {
                continue;
            }
            current.add(candidates[i]);
            backtrack(result, current, candidates, target, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
