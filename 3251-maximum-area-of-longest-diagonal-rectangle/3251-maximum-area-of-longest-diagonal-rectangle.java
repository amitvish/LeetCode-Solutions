class Solution {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        // find largest diagonal and give area
        int length = dimensions.length;
        int maxIndex = 0;
        int maxArea = 0;
        double maxDiagonal = 0;
        for (int i = 0; i < length; i++) {
            int w = dimensions[i][0];
            int h = dimensions[i][1];
            int area = w * h;
            double diagonal = Math.sqrt(w * w + h * h);
            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }
        return maxArea;
    }
}
