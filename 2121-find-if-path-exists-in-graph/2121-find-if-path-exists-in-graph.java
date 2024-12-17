class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //create a adj list from the given edges
        if (source == destination) return true;
        List<ArrayList<Integer>> adjList = createAdjList(n, edges);
        //dfs to find target and destination
        //start from source
        boolean[] visited = new boolean[n];
        visited[source] = true;
        return dfs(adjList, visited, source, destination);
    }

    private boolean dfs(List<ArrayList<Integer>> adjList, boolean[] visited, int source, int destination) {
        if (source == destination) return true;
        visited[source] = true;
        for (int neighbour : adjList.get(source)) {
            if (!visited[neighbour]) {
                if(dfs(adjList, visited, neighbour, destination)){
                    return true;
                }
            }
        }
        return false;
    }

    private List<ArrayList<Integer>> createAdjList(int n, int[][] edges) {
        List<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return adjList;
    }
}
