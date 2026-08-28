class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<Integer>[] graph = new ArrayList[n];

        for(int i = 0 ; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<edges.length; i++){
            int src = edges[i][0];
            int desc = edges[i][1];

            graph[src].add(desc);
            graph[desc].add(src);
        }
        boolean[] isvisited = new boolean[graph.length];

        return hasPath(graph , source , destination, isvisited);

    }

    public boolean hasPath(ArrayList<Integer>[] graph ,int source, int destination, boolean[] isvisited){

        // applying DFS
        if(source == destination) return true;
        isvisited[source] = true;

        for(int i = 0 ; i<graph[source].size(); i++){
            int e = graph[source].get(i);
            if(isvisited[e] == false && hasPath(graph , e , destination,isvisited)){
                return true;
            }
        }
        return false;
    }
}