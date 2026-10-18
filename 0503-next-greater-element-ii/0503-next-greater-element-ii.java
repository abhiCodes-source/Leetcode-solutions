class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            ans[i]=-1;
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                int peek=st.pop();
                ans[peek]=nums[i];
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                int peek=st.pop();
                ans[peek]=nums[i];
            }
            st.push(i);
        }
        return ans;
    }
}