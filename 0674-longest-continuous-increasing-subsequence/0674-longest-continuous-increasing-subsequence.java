class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int count=1;
        int ans=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}