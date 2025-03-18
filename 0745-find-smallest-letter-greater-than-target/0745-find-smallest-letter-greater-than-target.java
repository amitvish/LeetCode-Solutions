class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        char nextGreatest = letters[0];
        for (char letter : letters) {
            if (letter > target) {
                if (nextGreatest <= target) {
                    nextGreatest = letter;
                }
            }
        }
        return nextGreatest;
    }
}
