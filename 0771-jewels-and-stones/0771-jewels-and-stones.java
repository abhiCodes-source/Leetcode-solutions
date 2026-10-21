class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int m=jewels.length();
        int n=stones.length();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<m;i++){
            char ch=jewels.charAt(i);
            set.add(ch);
        }
        int count=0;
        for(int i=0;i<n;i++){
            char mh=stones.charAt(i);
            if(set.contains(mh)) count++;
        }
        return count;
    }
}