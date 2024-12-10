class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();

        backtrack(s, currentPartition, result, 0);
        return result;
    }

    private void backtrack(String s, List<String> currentPartition, List<List<String>> result, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                if (start <= end && end < s.length()) {
                    currentPartition.add(s.substring(start, end + 1));
                }

                backtrack(s, currentPartition, result, end + 1);
                if (!currentPartition.isEmpty()) {
                    currentPartition.remove(currentPartition.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
