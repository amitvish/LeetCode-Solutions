class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int num : nums) {
            elements.put(num, elements.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() // Compare entries by frequency
        );
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the least frequent element
            }
        }
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }
        return result;
    }
}
