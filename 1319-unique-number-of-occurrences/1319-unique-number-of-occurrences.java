class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        HashSet<Integer> occurances = new HashSet<>(map.values());
        return occurances.size() == map.size();
    }
}
