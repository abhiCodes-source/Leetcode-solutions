class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<m;i++){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                int peek=st.pop();
                map.put(nums2[peek],nums2[i]);
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(nums1[i])){
                ans[i]=map.get(nums1[i]);
            }
            else ans[i]=-1;
        }
        return ans;
    }
}