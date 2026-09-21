class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: nums1){
            if(!map.containsKey(num)) map.put(num,1);
            else map.put(num,map.get(num)+1);
        }
        HashMap<Integer,Integer> gap=new HashMap<>();
        for(int num: nums2){
            if(!gap.containsKey(num)) gap.put(num,1);
            else gap.put(num,gap.get(num)+1);
        }
        int m=nums1.length;
        int n=nums2.length;
        List <Integer> list=new ArrayList<>();
        if(m>n){
            for(int num: nums2){
                if(map.containsKey(num)){
                    list.add(num);
                    map.remove(num);
                }
            }
        }
        else{
            for(int num: nums1){
                if(gap.containsKey(num)){
                    list.add(num);
                    gap.remove(num);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}