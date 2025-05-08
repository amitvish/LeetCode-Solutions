class Solution {

    public boolean checkValidString(String s) {
        if (s.charAt(0) == ')') return false;
        //leftMin shouldn't be less than 0
        int leftMin = 0;
        int leftMax = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftMin++;
                leftMax++;
                System.out.println("leftMin: " + leftMin + " leftMax: " + leftMax);
            } else if (c == ')') {
                leftMin--;
                leftMax--;
                System.out.println("leftMin: " + leftMin + " leftMax: " + leftMax);
            } else if (c == '*') {
                leftMax++;
                leftMin--;
                System.out.println("leftMin: " + leftMin + " leftMax: " + leftMax);
            }
            if (leftMax < 0) return false;
            if (leftMin < 0) leftMin = 0;
        }
        System.out.println("leftMin: " + leftMin + " leftMax: " + leftMax);
        return leftMin == 0;
    }
}
