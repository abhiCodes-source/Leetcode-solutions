class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int fre=map.get(arr[i]);
                map.put(arr[i],fre+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int ele: map.keySet()){
            int fre=map.get(ele);
            if(set.contains(fre)) {
                return false;
            }
            set.add(fre);
        }
        return true;
    }
}