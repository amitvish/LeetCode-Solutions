class Solution {

    public int largestRectangleArea(int[] heights) {
        //find largest rectangle for each bar
        //next smallest element array
        int rightSmallest[] = new int[heights.length];

        Stack<Integer> stack2 = new Stack<>();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && heights[stack2.peek()] >= heights[i]) {
                stack2.pop();
            }
            rightSmallest[i] = stack2.isEmpty() ? heights.length : stack2.peek();
            stack2.push(i);
        }

        //find left smallest now.
        int leftSmallest[] = new int[heights.length];

        Stack<Integer> stack1 = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            while (!stack1.isEmpty() && heights[stack1.peek()] >= heights[i]) {
                stack1.pop();
            }
            leftSmallest[i] = stack1.isEmpty() ? -1 : stack1.peek();
            stack1.push(i);
        }

        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        //find right smallest and left smallest for each height

        for (int i = 0; i < heights.length; i++) {
            //left smaller, right smaller than current one
            // width = l - r - 1;
            int width = rightSmallest[i] - leftSmallest[i] - 1;
            int currArea = heights[i] * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
}
