class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int Max=Integer.MIN_VALUE;
            int Min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++) Max=Math.max(Max,nums[j]);
            for(int j=i;j<n;j++) Min=Math.min(Min,nums[j]);
            int diff=Max-Min;
            if(diff<=k) return i;
        }
        return -1;
    }
}