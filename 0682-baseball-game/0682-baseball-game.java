class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String operation : operations) {
            if (operation.equals("C")) {
                sum -= stack.pop();
            } else if (operation.equals("D")) {
                stack.push(2 * stack.peek());
                sum += stack.peek();
            } else if (operation.equals("+")) {
                int temp = stack.pop();
                int currSum = stack.peek() + temp;
                stack.push(temp);
                stack.push(currSum);
                sum += currSum;
            } else {
                int current = Integer.valueOf(operation);
                stack.push(current);
                sum += current;
            }
        }
        return sum;
    }
}
