class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //find no. of 0 with adjacent zero

        int sum = 0;
        int k = flowerbed.length;
        int newFlowerbed[] = new int[k + 2];
        newFlowerbed[0] = 0;
        newFlowerbed[k + 1] = 0;
        for (int i = 0; i < k; i++) {
            newFlowerbed[i + 1] = flowerbed[i];
        }
        for (int i = 1; i < newFlowerbed.length - 1; i++) {
            if (newFlowerbed[i - 1] == 0 && newFlowerbed[i + 1] == 0 && newFlowerbed[i] != 1) {
                newFlowerbed[i] = 1;
                sum++;
            }
        }
        return sum >= n;
    }
}
