class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n =adj.size();
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] vis = new boolean[n];
        dfs(0,adj,vis,result);
        
        return result;
    }
    
    
    void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> result){
        vis[node]=true;
        result.add(node);
        
        for(int i:adj.get(node)){
            if (!vis[i]){
                dfs(i,adj,vis,result);
            }
        }
        
        
        
    }
}

