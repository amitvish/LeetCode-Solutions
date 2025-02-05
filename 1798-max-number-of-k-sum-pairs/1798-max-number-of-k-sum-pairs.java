class Solution {

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int compliment = k - num;
            if (numCount.containsKey(compliment)) {
                count++;
                int value = numCount.get(compliment);
                if (value > 1) {
                    numCount.put(compliment, value - 1);
                } else {
                    numCount.remove(compliment);
                }
            } else {
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}
