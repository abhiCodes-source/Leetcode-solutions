class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            HashSet<Character>set=new HashSet<>();
            int count=0;
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);
                count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}