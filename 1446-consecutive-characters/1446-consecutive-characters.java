class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int ans=1;
        int count=1;
        for(int i=1;i<n;i++){
            char ch=s.charAt(i);
            char mh=s.charAt(i-1);
            if(ch==mh) count++;
            else count=1;
            ans=Math.max(ans,count);
        }
        return ans;
    }
}