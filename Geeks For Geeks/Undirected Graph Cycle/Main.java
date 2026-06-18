class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
         adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
         boolean[] visited = new boolean[V];
           for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                
                if (dfs(i, -1, adj, visited)) {
                    return true;
                }
            }
        }
    return false;}

public boolean dfs(int node, int parent, List<List<Integer>> adj, boolean [] vis){
    vis[node]=true;
    
    for(int k: adj.get(node)){
        if(!vis[k]){
            if(dfs(k,node,adj,vis)){
                return true;
            }}
        else if(k!=parent){
                return true;
            }

        }
        return false;}

    
}