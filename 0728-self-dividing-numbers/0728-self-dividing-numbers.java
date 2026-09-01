class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean flag=true;
            int num=i;
            while(num!=0){
                int rem=num%10;
                if(rem==0 || i%rem!=0) flag=false;
                num=num/10;
            }
            if(flag==true) arr.add(i);
        }
        return arr;
    }
}