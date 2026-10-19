
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        int i=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                ans=Math.min(ans,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(ans>n) ans=0;
        return ans;
    }
}