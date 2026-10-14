class Solution {
    public void twosumhelper(int f,int[] nums,List<List<Integer>> res){
        int i=f+1;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[f]+nums[i]+nums[j];
            if(sum>0){
                j--;
            }
            else if(sum<0){
                i++;
            }
            else{
                res.add(Arrays.asList(nums[f],nums[i],nums[j]));
                i++;
                j--;
                while(i<j && nums[i]==nums[i-1]){
                    i++;
                }
                while(i<j && nums[j]==nums[j+1]){
                    j--;
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                break;
            }
            if(i==0 || nums[i]!=nums[i-1]){
                twosumhelper(i,nums,res);
            }
        }
        return res;
    }
}