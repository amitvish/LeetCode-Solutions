class Solution {

    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> lastIndexMap = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();

        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            end = Math.max(end, lastIndexMap.get(s.charAt(i)));
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
