class Solution {
    public void dfs(int i,boolean[]vis,List<List<Integer>>adj){
        vis[i]=true;
        for(int j=0;j<adj.get(i).size();j++){
            if(!vis[adj.get(i).get(j)]) dfs(adj.get(i).get(j),vis,adj);
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int k=0;k<n;k++){
            List<Integer>arr=new ArrayList<>();
            adj.add(arr);
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean []vis=new boolean[n];
        dfs(source,vis,adj);
        for(int l=0;l<n;l++){
            if(vis[destination]==false) return false;
        }
        return true;
    }
}