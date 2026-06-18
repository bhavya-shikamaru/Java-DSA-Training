class Solution {
    int m,n;
    public int numIslands(char[][] grid) {
        int count =0;
        n=grid.length;
        if(n==0) return 0;
        m=grid[0].length;
        boolean[][] vis = new boolean[n][m];

        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(grid,vis,i,j);
                    count++;
                }
            }
        }


        return count;
    }
    void dfs(char[][] grid, boolean[][] vis, int row, int col){
        
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||vis[row][col]||grid[row][col]=='0'){
            return;
        }
        vis[row][col]=true;
        dfs(grid,vis,row+1,col);
        dfs(grid, vis, row-1, col);
        dfs(grid, vis, row,col+1);
        dfs(grid,vis,row,col-1);
    }
}