class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])) ans.add(nums[i]);
            else set.add(nums[i]);
        }
        return ans;
    }
}