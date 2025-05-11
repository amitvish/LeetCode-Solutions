class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //find next greater element of all element of nums2
        int nextGreater[] = new int[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            nextGreater[i] = -1;
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    nextGreater[i] = nums2[j];
                    break;
                }
            }
        }
        int result[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = nextGreater[j];
                    break;
                }
            }
        }

        return result;
    }
}
