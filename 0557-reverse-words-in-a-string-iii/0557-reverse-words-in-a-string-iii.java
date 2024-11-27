class Solution {

    public String reverseWords(String s) {
        String[] stringArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = new StringBuilder(stringArr[i]).reverse().toString();
        }
        for (int i = 0; i < stringArr.length; i++) {
            sb.append(stringArr[i]);
            if (i < stringArr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
