class Solution {

    public int compress(char[] chars) {
        int write = 0, read = 0;
        // sb.append(chars[0]);
        while (read < chars.length) {
            int count = 0;
            char currentChar = chars[read];
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            chars[write] = currentChar;
            write++;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
    }
}
