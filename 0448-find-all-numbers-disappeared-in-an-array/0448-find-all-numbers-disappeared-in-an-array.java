class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        // if from 1 to n that is not in nums return that
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
