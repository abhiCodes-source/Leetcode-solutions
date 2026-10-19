class Solution {
    public String reverse(String m) {
        String reverse = "";
        for (int i = m.length() - 1; i >= 0; i--) {
            reverse += m.charAt(i);
        }
        return reverse;
    }
    public String reverseWords(String s) {
        String ans = "";
        String helper = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            String help = ch + "";
            if (!help.equals(" ")) {
                helper += ch;
            } 
            else {
                if (!helper.equals("")) {
                    ans += reverse(helper);
                    ans += " ";
                    helper = "";
                }
            }
        }
        if (!helper.equals("")) {
            ans += reverse(helper);
        }
        ans = ans.trim();
        return ans;
    }
}