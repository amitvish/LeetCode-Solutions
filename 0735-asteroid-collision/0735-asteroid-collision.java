class Solution {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    asteroid = 0;
                    stack.pop();
                } else if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    stack.pop();
                } else {
                    asteroid = 0;
                }
            }
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
