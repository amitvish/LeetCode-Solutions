import java.util.Stack;

class Solution {

    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the number for multi-digit cases
                currentNumber = currentNumber * 10 + (c - '0');
            } else if (c == '[') {
                // Push the current number and string onto their stacks
                numberStack.push(currentNumber);
                stringStack.push(currentString);
                // Reset for the next segment
                currentNumber = 0;
                currentString = new StringBuilder();
            } else if (c == ']') {
                // Decode the substring
                int repeatTimes = numberStack.pop();
                StringBuilder decodedString = stringStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                // Append characters to the current string
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}
