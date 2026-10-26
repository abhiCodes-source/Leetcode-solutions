class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n) return false;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i),1);
            }
        }
        char[] charArray = s2.toCharArray();
        HashMap<Character,Integer>cap=new HashMap<>();
        int k=0;
        for(k=0;k<n;k++){
            if(cap.containsKey(s2.charAt(k))){
                cap.put(s2.charAt(k),cap.get(s2.charAt(k))+1);
            }
            else{
                cap.put(s2.charAt(k),1);
            }
        }
        if(map.equals(cap)) return true;
        int j=0;
        while(k<m){
            if(cap.containsKey(s2.charAt(k))){
                cap.put(s2.charAt(k),cap.get(s2.charAt(k))+1);
            }
            else{
                cap.put(s2.charAt(k),1);
            }
            if(cap.get(s2.charAt(j))==1){
                cap.remove(s2.charAt(j));
            }
            else{
                cap.put(s2.charAt(j),cap.get(s2.charAt(j))-1);
            }
            if(map.equals(cap)) return true;
            k++;
            j++;
        }
        return false;
    }
}