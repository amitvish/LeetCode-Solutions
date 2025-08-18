class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        //create a hashset and keep adding no. until duplicates come
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result.add(num);
            }
            else{
              set.add(num);
            }
        }
        return result;
    }
}
