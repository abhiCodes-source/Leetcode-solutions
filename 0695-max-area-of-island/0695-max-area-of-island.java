class Solution {
    class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int bfs(int i,int j,int[][] grid){
        grid[i][j]=0;
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(i,j));
        int count=1;
        while(!q.isEmpty()){
            pair front=q.remove();
            int row=front.row;
            int col=front.col;
            if(row>0 && grid[row-1][col]==1){
                grid[row-1][col]=0;
                count++;
                q.add(new pair(row-1,col));
            }
            if(col>0 && grid[row][col-1]==1){
                grid[row][col-1]=0;
                count++;
                q.add(new pair(row,col-1));
            }
            if(row<grid.length-1 && grid[row+1][col]==1){
                grid[row+1][col]=0;
                count++;
                q.add(new pair(row+1,col));
            }
            if(col<grid[0].length-1 && grid[row][col+1]==1){
                grid[row][col+1]=0;
                count++;
                q.add(new pair(row,col+1));
            }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
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