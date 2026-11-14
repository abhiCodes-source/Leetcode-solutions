class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int ans = Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int sum=0;
            int j=0;
            for(j=0;j<i;j++){
               sum+=nums.get(j);
            }
            if(sum>0 && sum<ans) ans=sum;
            int k=0;
            while(j<n){
                sum+=nums.get(j);
                sum-=nums.get(k);
                j++;
                k++;
                if(sum>0 && sum<ans) ans=sum;
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}