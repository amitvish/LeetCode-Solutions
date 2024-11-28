class Solution {

    public List<List<Integer>> combine(int n, int k) {
        //find all combination add only with size = 2
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(result, current, n, 1, k);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int n, int start, int k) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(result, current, n, i + 1, k);
            current.remove(current.size() - 1);
        }
    }
}
