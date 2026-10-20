class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double avg=0;
        int i=0;
        int j=0;
        double sum=0;
        for(i=0;i<k;i++){
            sum+=nums[i];
        }
        avg=sum/k;
        while(i<n){
            sum+=nums[i];
            sum-=nums[j];
            i++;
            j++;
            avg=Math.max(avg,sum/k);
        }
        return avg;
    }
}