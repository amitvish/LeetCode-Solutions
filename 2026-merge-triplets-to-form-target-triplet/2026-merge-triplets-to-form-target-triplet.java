class Solution {

    public boolean mergeTriplets(int[][] triplets, int[] target) {
        //define result
        int[] result = new int[target.length];
        for(int[] triplet : triplets){
            if(triplet[0] <= target[0] && triplet[1] <= target[1] && triplet[2] <= target[2]){
                result[0] = Math.max(result[0], triplet[0]);
                result[1] = Math.max(result[1], triplet[1]);
                result[2] = Math.max(result[2], triplet[2]);
            }
        }
        return Arrays.equals(target, result);
    }
}
