class Solution {
    class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int i,int j,char[][] grid){
        grid[i][j]='0';
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(i,j));
        while(!q.isEmpty()){
            pair front=q.remove();
            int row=front.row;
            int col=front.col;
            if(row>0 && grid[row-1][col]=='1'){
                q.add(new pair(row-1,col));
                grid[row-1][col]='0';
            }
            if(col>0 && grid[row][col-1]=='1'){
                q.add(new pair(row,col-1));
                grid[row][col-1]='0';
            }
            if(row<grid.length-1 && grid[row+1][col]=='1'){
                q.add(new pair(row+1,col));
                grid[row+1][col]='0';
            }
            if(col<grid[0].length-1 && grid[row][col+1]=='1'){
                q.add(new pair(row,col+1));
                grid[row][col+1]='0';
            }            
        }

    }
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    } 
}
