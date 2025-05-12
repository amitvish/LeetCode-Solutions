class Solution {

    public int addDigits(int num) {
        if (num <= 9 ) return num;
        while (num > 9) {
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            System.out.println("num: " + num);
            num = sum;
        }
        return num;
    }
}
