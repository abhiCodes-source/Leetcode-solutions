class Solution {
    public void dfs(char[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        grid[i][j] = '0';
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        for(int d[]: dir){
            int r_n=i+d[0];
            int c_n=j+d[1];
            if(r_n>=0 && r_n<m && c_n>=0 && c_n<n && grid[r_n][c_n]=='1'){
                dfs(grid,r_n,c_n);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}