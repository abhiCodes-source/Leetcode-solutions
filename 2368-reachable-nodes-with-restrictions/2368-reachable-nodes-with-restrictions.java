class Solution {
    public void bfs(boolean vis[],List<List<Integer>> adj,int i,HashSet<Integer>set){
        vis[i]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int  temp=q.remove();
            for(int j=0;j<adj.get(temp).size();j++){
                int help=adj.get(temp).get(j);
                if(!vis[help] &&!set.contains(help)){
                    vis[help]=true;
                    q.add(help);
                }
            }
        }
    }
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
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
        HashSet<Integer>set=new HashSet<>();
        for(int k=0;k<restricted.length;k++){
            set.add(restricted[k]);
        }
        bfs(vis,adj,0,set);
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]) count++;
        }
        return count;
    }
}