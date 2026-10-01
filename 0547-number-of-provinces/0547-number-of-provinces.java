class Solution {
    public void dfs(int[][] isConnected,int src,boolean []visited){
        int m=isConnected.length;
        visited[src]=true;
        for(int i=0;i<m;i++){
            if(isConnected[src][i]==1 && visited[i]==false){
                dfs(isConnected,i,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int count=0;
        boolean visited[]=new boolean[m];
        for(int i=0;i<m;i++){
            if(visited[i]==false){
                dfs(isConnected,i,visited);
                count++;
            }
        }
        return count;        
    }
}