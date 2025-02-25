class Solution {

    public int[] replaceElements(int[] arr) {
        int index = 0;
        int n = arr.length;
        int result[] = new int[n];
        result[n - 1] = -1;
        for (int i = 0; i < n - 1; i++) {
            result[i] = max(arr, i + 1);
        }
        return result;
    }

    private int max(int[] arr, int i) {
        // find max start from index i to last
        int max = arr[i];
        for (int j = i; j < arr.length; j++) {
            if (arr[j] > max) max = arr[j];
        }
        return max;
    }
}
