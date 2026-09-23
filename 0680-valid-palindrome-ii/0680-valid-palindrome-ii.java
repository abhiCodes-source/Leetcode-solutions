class Solution {
    public boolean ispallindrome(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return ispallindrome(i,j-1,s) || ispallindrome(i+1,j,s);
            i++;
            j--;
        }
        return true;
    }
}
