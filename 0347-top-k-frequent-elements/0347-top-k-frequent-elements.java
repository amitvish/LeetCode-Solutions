class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Buckets: array of lists where index = frequency
        List<Integer>[] count = new List[nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            count[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            count[value].add(key);
        }

        for (int i = count.length - 1; i >= 0 && result.size() < k; i--) {
            for (int j = 0; j < count[i].size() && result.size() < k; j++) {
                result.add(count[i].get(j));
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}