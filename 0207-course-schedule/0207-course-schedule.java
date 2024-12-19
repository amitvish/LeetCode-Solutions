class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //build adjencency list
        List<ArrayList<Integer>> adjList = new ArrayList<>();
        //fill the adjlist
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        //1 before 0
        for (int[] prerequisite : prerequisites) {
            adjList.get(prerequisite[1]).add(prerequisite[0]);
        }
        int visited[] = new int[numCourses];
        //visit all course return false if cycle
        for (int course = 0; course < numCourses; course++) {
            if (hasCycle(course, adjList, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(int course, List<ArrayList<Integer>> adjList, int visited[]) {
        if (visited[course] == 1) return true;
        if (visited[course] == 2) return false;
        visited[course] = 1;
        for (int neighbour : adjList.get(course)) {
            if (hasCycle(neighbour, adjList, visited)) {
                return true;
            }
        }
        visited[course] = 2;
        return false;
    }
}
