class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nextGreaterElement[] = new int[nums2.length];

        Stack<Integer> stack = new Stack<>();
        //fill nextGreater element array with stack
        //start from last and go towards first
        //add index in stack
        //craete decreaing stack
        System.out.println("nums2.length = " + nums2.length); // should print 4

        for (int i = nums2.length - 1; i >= 0; i--) {
            System.out.println("i: " + i + ", stack: " + stack); // DEBUG

            while (!stack.isEmpty() && nums2[stack.peek()] <= nums2[i]) {
                stack.pop();
            }

            nextGreaterElement[i] = stack.isEmpty() ? -1 : nums2[stack.peek()];

            stack.push(i);
        }
        // Map value to its next greater for nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextGreaterElement[i]);
        }
        // Build result for nums1
        int result[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
