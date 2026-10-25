class Solution {
    public void dfs(int i,boolean []visited,int [][]isConnected){
        visited[i]=true;
        for(int j=0;j<isConnected[0].length;j++){
            if(isConnected[i][j]==1 && visited[j]==false){
                dfs(j,visited,isConnected);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
}