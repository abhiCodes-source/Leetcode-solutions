
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (sToT.containsKey(a)) {
                if (sToT.get(a) != b) {
                    return false;
                }
            } else {
                sToT.put(a, b);
            }

            if (tToS.containsKey(b)) {
                if (tToS.get(b) != a) {
                    return false;
                }
            } else {
                tToS.put(b, a);
            }
        }

        return true;
    }
}