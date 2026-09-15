class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int x=s.lastIndexOf(" ");
        int n=s.length();
        return n-x-1;
    }
}