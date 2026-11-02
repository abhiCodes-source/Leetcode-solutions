
class RandomizedSet {

    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {

        if(map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        if(!map.containsKey(val)) {
            return false;
        }

        int idx = map.get(val);

        int last = list.get(list.size() - 1);

        list.set(idx, last);

        map.put(last, idx);

        list.remove(list.size() - 1);

        map.remove(val);

        return true;
    }

    public int getRandom() {

        int idx = random.nextInt(list.size());

        return list.get(idx);
    }
}
