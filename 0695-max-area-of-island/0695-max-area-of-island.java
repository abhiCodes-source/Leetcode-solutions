class Solution {
    public int bfs(int i,int j,int[][] grid){
        grid[i][j]=0;
        int area=1;
        if(i>0 && grid[i-1][j]==1) area+=bfs(i-1,j,grid);
        if(j>0 && grid[i][j-1]==1) area+=bfs(i,j-1,grid);
        if(i<grid.length-1 && grid[i+1][j]==1) area+=bfs(i+1,j,grid);
        if(j<grid[0].length-1 && grid[i][j+1]==1) area+=bfs(i,j+1,grid);
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int new_area=bfs(i,j,grid);
                    max_area=Math.max(max_area,new_area);
                }
            }
        }
        return max_area;
    }
}