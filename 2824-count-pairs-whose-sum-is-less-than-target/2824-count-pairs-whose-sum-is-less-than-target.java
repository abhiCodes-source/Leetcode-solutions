class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i=0;
        int j=nums.size()-1;
        int count=0;
        while(i<j){
            while(i<j && nums.get(i)+nums.get(j)>=target){
                j--;                
            } 
            if(i<j && nums.get(i)+nums.get(j)<target){
                count+=j-i;
            }
            i++;
        }
        return count;
    }
}