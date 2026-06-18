class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int size = adj.size();
        int node = 0;
        q.add(node);
        boolean[] visited = new boolean[size];
        for(int i = 0; i < size; i++){
            visited[i] = false;
        }
        visited[node] = true;
        while(!q.isEmpty()){
            int current = q.poll();
            ans.add(current);
            for(int nei : adj.get(current)){
                if(!visited[nei]){
                    visited[nei] = true;
                    q.add(nei);
                }
    }
}
        return ans;
    }} 