class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char t=st.pop();
                if(map.get(t)!=c) return false;
            }
        }
        return st.isEmpty();
    }
}