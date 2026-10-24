class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            int z = ch - '0';
            if(z%2!=0) return num.substring(0, i+1);
        }
        return "";
    }
}