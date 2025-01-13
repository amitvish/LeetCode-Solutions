class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largest = 0;
        for (int candy : candies) {
            if (candy > largest) largest = candy;
        }
        for (int candy : candies) {
            if (candy + extraCandies >= largest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
