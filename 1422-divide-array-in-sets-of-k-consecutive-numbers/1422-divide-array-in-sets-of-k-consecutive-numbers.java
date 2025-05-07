class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        //step - 1: check if grouping is possible
        if(hand.length % groupSize != 0) return false;

        //step - 2: make a treemap of unique cards
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int card : hand){
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        //form consecutive groups
        for(int card : map.keySet()){
            int cardCount = map.get(card);
            if(cardCount > 0){
                for(int i = 0; i < groupSize; i++){
                    int nextCard = card + i;
                    int nextCardCount = map.getOrDefault(nextCard, 0);
                    if(nextCardCount < cardCount){
                        return false;
                    }
                    map.put(nextCard, nextCardCount - cardCount);
                }
            }
        }

       return true;
    }
}