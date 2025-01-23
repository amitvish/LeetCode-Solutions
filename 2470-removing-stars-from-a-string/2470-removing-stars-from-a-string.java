class Solution {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
