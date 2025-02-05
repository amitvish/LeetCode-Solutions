class Solution {
    public String longestPalindrome(String s) {
        // StringBuilder sb = new StringBuilder();
        String newString = "";
        int maxLength = 0;
        
        for(int i = 0; i < s.length(); i++){
            //for odd length palindrome
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left + 1 > maxLength){
                    maxLength = right - left + 1;
                    newString = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
            //for even length
            left = i;
            right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left + 1 > maxLength){
                    maxLength = right - left + 1;
                    newString = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
        return newString;
    }
}