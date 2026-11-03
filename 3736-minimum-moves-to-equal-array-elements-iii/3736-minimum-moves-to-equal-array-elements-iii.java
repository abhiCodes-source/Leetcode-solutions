class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int ans=0;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maximum=Math.max(maximum,nums[i]);
        }
        for(int i=0;i<n;i++){
            ans+=maximum-nums[i];
        }
        return ans;
    }
}