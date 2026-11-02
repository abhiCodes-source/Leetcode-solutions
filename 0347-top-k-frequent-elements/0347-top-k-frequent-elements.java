class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[k];
        int l=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);                
            }
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<k;i++){
            int help2=0;
            int help=Integer.MIN_VALUE;
            for (int key : map.keySet()) {
                if(map.get(key)>help && !set.contains(key)){
                    help=map.get(key);
                    help2=key;
                }
            }
            set.add(help2);
            ans[l++]=help2;
        }
        Arrays.sort(ans);
        return ans;
    }
}