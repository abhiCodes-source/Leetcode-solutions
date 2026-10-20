class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0;
        int dub=0;
        long ans=Integer.MIN_VALUE;
        int j=0;
        int i=0;
        for(i=0;i<k;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                dub++;
            }
            else{
                map.put(nums[i],1);
            }
            sum+=nums[i];
        }
        if(dub==0) ans=Math.max(ans,sum);
        while(i<n){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                dub++;
            }
            else{
                map.put(nums[i],1);
            }
            sum+=nums[i];
            if(map.get(nums[j])!=1){
                map.put(nums[j],map.get(nums[j])-1);
                dub--;
            }
            else{
                map.remove(nums[j]);
            }
            sum-=nums[j];
            i++;
            j++;
            if(dub==0) ans=Math.max(ans,sum);
        }
        if(ans<0) ans=0;
        return ans;
    }
}