class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int fre=map.get(ch);
                map.put(ch,fre+1);
            }
            else{
                map.put(ch,1);
            }
        }
        HashMap<Character,Integer> hap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(hap.containsKey(ch)){
                int fre=hap.get(ch);
                hap.put(ch,fre+1);
            }
            else{
                hap.put(ch,1);
            }
        }
        return map.equals(hap);
    }
}