class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int ans=0;
        for(int i=1;i<n-1;i++){
            int curr=height[i];
            int leftmax=curr;
            int rightmax=curr;
            for(int j=i-1;j>=0;j--){
                leftmax=Math.max(leftmax,height[j]);
            }
            for(int k=i+1;k<n;k++){
                rightmax=Math.max(rightmax,height[k]);
                if(rightmax>=leftmax) break;
            }
            ans+=Math.min(rightmax,leftmax)-curr;
        }
        return ans;
    }
}