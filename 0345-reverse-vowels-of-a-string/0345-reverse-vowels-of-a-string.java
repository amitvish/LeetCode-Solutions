class Solution {

    public String reverseVowels(String s) {
        //two pointers and swap the vowels
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;
        char chars[] = s.toCharArray();
        while (left < right) {
            while (left < right && !isVowel(s.charAt(left))) {
                left++;
            }
            while (left < right && !isVowel(s.charAt(right))) {
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    private boolean isVowel(char ch) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        return vowels.contains(Character.toLowerCase(ch));
    }
}
