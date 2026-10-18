class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[n];
        for(int i=0;i<m;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<n;i++){
            int help=map.get(nums1[i]);
            boolean flag=false;
            int idx=-1;
            for(int j=help+1;j<m;j++){
                if(nums2[j]>nums1[i]){
                    flag=true;
                    idx=j;
                    break;
                }
            }
            if(flag==true) ans[i]=nums2[idx];
            else ans[i]=-1;
        }
        return ans;
    }
}