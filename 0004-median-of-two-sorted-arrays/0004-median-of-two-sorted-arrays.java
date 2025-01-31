class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int nums[] = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                k++;
                i++;
            } else {
                nums[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < nums1.length) {
            nums[k] = nums1[i];
            k++;
            i++;
        }
        while (j < nums2.length) {
            nums[k] = nums2[j];
            k++;
            j++;
        }

        int mid = nums.length / 2;

        if (nums.length % 2 != 0) return nums[mid];

        result = nums[mid] + nums[mid - 1];
        return result / 2;
    }
}
