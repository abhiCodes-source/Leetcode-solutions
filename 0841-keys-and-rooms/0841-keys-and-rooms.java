class Solution {
    public void dfs(int i,boolean visited[],List<List<Integer>> rooms){
        visited[i]=true;
        for(int j=0;j<rooms.get(i).size();j++){
            if(!visited[rooms.get(i).get(j)]){
                dfs(rooms.get(i).get(j),visited,rooms);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visited[]=new boolean[n];
        dfs(0,visited,rooms);
        for(int i=0;i<n;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}