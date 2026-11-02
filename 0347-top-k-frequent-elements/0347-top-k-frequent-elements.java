class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);                
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()) {
            pq.add(key);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int ans[] = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}