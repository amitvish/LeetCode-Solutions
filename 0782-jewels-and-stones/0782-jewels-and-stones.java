class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        //count for hashmap
        HashMap<Character, Integer> countMap = new HashMap<>();
        int count = 0;
        //save count in value

        for (char stone : stones.toCharArray()) {
            countMap.put(stone, countMap.getOrDefault(stone, 0) + 1);
        }

        for (char jewel : jewels.toCharArray()) {
            if (countMap.containsKey(jewel)) {
                count += countMap.get(jewel);
            }
        }
        return count;
    }
}
