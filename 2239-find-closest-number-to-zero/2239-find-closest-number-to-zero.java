class Solution {
    public int findClosestNumber(int[] nums) {
        int n=nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x=Math.abs(nums[i]);
            if(x<Math.abs(min)){
                min=nums[i];
            }
            else if(x==Math.abs(min)){
                min=Math.max(nums[i],min);
            }
        }
        return min;
    }
}