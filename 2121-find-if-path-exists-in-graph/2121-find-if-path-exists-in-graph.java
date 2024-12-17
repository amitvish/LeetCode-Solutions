class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //create a adj list from the given edges
        List<ArrayList<Integer>> adjList = createAdjList(n, edges);
        //start from source
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int vertex = q.poll();
            if(vertex == destination) return true;
            for(int neighbour : adjList.get(vertex)){
                if(!visited[neighbour]){
                    q.offer(neighbour);
                    visited[neighbour] = true;
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
