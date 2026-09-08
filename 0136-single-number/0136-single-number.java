class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    nums[i]=0;
                    nums[j]=0;
                }
            }
        }
        int x=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                x = nums[i];
            }
        }
        return x;
    }
}