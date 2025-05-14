class Solution {

    public int carFleet(int target, int[] position, int[] speed) {
        //if point of intersection < target then it is one fleet
        //time to reach destination for each car
        //iif previous cart reaches before there is intersection
        // spped = d/t, d = target - postion[i]
        // t = d/s,
        //hashmap for sposition and time
        HashMap<Integer, Double> positionTimeMap = new HashMap<>();
        Double time[] = new Double[position.length];
        for (int i = 0; i < position.length; i++) {
            if (speed[i] != 0) {
                time[i] = (double) (target - position[i]) / speed[i];
            } else {
                time[i] = Double.MAX_VALUE;
            }
            positionTimeMap.put(position[i], time[i]);
        }

        //start from right most of position
        Arrays.sort(position);
        int fleet = position.length;
        //use stack instead of double loop
        //add time in stack
        Stack<Double> stack = new Stack<>();
        for (int i = position.length - 1; i >= 0; i--) {
            Double currTime = positionTimeMap.get(position[i]);
            if (stack.isEmpty() || currTime > stack.peek()) {
                stack.push(currTime);
            }
        }

        return stack.size();
    }
}
