class Solution {
    
    public boolean helper(int n,HashSet<Integer> set){
        if(n==1) return true;
        if(set.contains(n)) return false;
        set.add(n);
        int num=n;
        int sum=0;
        while(num!=0){
            int d=num%10;
            sum+=Math.pow(d,2);
            num/=10;
        }
        return helper(sum,set);
    }
    public boolean isHappy(int n) {
    HashSet<Integer> set=new HashSet<>();
    return helper(n,set);
    }
}