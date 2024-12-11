class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (str.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (str.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (str.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else if (str.equals("-")) {
                stack.push(0 - (stack.pop() - stack.pop()));
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
