class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int i = 0;
        int j = i + n;
        while (j <= s2.length()) {
            String current = s2.substring(i, j);
            if (isPermutation(s1, current)) {
                return true;
            }
            i++;
            j = i + n;
        }
        return false;
    }

    private boolean isPermutation(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
