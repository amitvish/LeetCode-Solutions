class Solution {

    public int numOfSubarrays(int[] arr) {
        int result = 0;
        int prefixSum = 0;
        int evenCount = 1;
        int oddCount = 0;
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 == 0) {
                result = (result + oddCount) % 1000000007;
                evenCount++;
            } else {
                result = (result + evenCount) % 1000000007;
                oddCount++;
            }
        }
        return result;
    }
}
