class Solution {
    public void bfs(int i,List<List<Integer>> adj,boolean vis[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int j=0;j<adj.get(front).size();j++){
                if(!vis[adj.get(front).get(j)]){
                    vis[adj.get(front).get(j)]=true;
                    q.add(adj.get(front).get(j));
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>arr=new ArrayList<>();
            adj.add(arr);
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean vis[]=new boolean[n];
        vis[source]=true;
        bfs(source,adj,vis);
        return vis[destination];
    }
}