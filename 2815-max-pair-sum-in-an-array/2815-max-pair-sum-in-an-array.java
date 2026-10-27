class Solution {
    public int find_max(int num){
        int maximum=Integer.MIN_VALUE;
        while(num!=0){
            int d=num%10;
            maximum=Math.max(maximum,d);
            num/=10;
        }
        return maximum;
    }
    public int maxSum(int[] nums) {
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(find_max(nums[i])==find_max(nums[j])){
                    ans=Math.max(ans,nums[i]+nums[j]);
                }
            }
        }
        return ans;
    }
}