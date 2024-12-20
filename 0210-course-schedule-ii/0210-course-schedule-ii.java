class Solution {
    int result[];
    int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<ArrayList<Integer>> adjList = new ArrayList<>();
        result = new int[numCourses];
        index = numCourses - 1;
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adjList.get(prerequisite[1]).add(prerequisite[0]);
        }
        int visited[] = new int[numCourses];
        for (int course = 0; course < numCourses; course++) {
            if (hasCycle(course, adjList, visited)) {
                return new int[0];
            }
        }
        return result;
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
        result[index--] = course;
        return false;
    }
}
