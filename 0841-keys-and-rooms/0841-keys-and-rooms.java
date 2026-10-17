class Solution {
    public void bfs(int i,boolean visited[],List<List<Integer>> rooms){
        visited[i]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int j=0;j<rooms.get(front).size();j++){
                if(!visited[rooms.get(front).get(j)]){
                    visited[rooms.get(front).get(j)]=true;
                    q.add(rooms.get(front).get(j));
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visited[]=new boolean[n];
        bfs(0,visited,rooms);
        for(int i=0;i<n;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}