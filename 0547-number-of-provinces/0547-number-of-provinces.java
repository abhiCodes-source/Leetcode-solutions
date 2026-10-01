class Solution {
    public void bfs(int[][] isConnected,int src,boolean []visited){
        int m=isConnected.length;
        Queue<Integer> q=new LinkedList<>();
        visited[src]=true;
        q.add(src);
        while(!q.isEmpty()){
            int u=q.remove();
            for(int v=0;v<m;v++){
                if(isConnected[u][v]==1 && visited[v]==false){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int count=0;
        boolean visited[]=new boolean[m];
        for(int i=0;i<m;i++){
            if(visited[i]==false){
                bfs(isConnected,i,visited);
                count++;
            }
        }
        return count;        
    }
}