class Solution {
    public int appendCharacters(String s, String t) {
        int m=s.length();
        int n=t.length();
        int k=0;
        int ans=0;
        for(int i=0;i<n;i++){
            char th=t.charAt(i);
            boolean flag=false;
            for(int j=k;j<m;j++){
                char sh=s.charAt(j);
                if(th==sh){
                    flag=true;
                    k=j+1;
                    break;
                }
            }
            if(!flag){
                ans=n-i;
                break;
            }
        }
        return ans;
    }
}