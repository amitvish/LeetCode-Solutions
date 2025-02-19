class Solution {

    public boolean isThree(int n) {
        if (n == 1) return false;
        int count = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) count++;
        }
        return count == 3 ? true : false;
    }
}
