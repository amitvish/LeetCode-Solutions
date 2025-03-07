class Solution {

    public int[] closestPrimes(int left, int right) {
        // find prime then choose left and right
        List<Integer> primeList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }

        int[] result = new int[2];
        if (!primeList.isEmpty() && primeList.size() > 1) {
            int n = primeList.size();
            result[0] = primeList.get(0);
            result[1] = primeList.get(1);
            int diff = result[1] - result[0];
            for (int i = 0; i < n - 1; i++) {
                int currDiff = primeList.get(i + 1) - primeList.get(i);
                if (currDiff < diff) {
                    result[0] = primeList.get(i);
                    result[1] = primeList.get(i + 1);
                    diff = result[1] - result[0];
                }
            }
        } else {
            result[0] = -1;
            result[1] = -1;
        }
        return result;
    }

    private boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
