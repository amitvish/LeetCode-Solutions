class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        char nextGreatest = letters[0];
        for (char letter : letters) {
            if (nextGreatest <= target) {
                nextGreatest = letter;
            }
        }
        if (nextGreatest <= target) return letters[0];
        return nextGreatest;
    }
}
