class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<>();

        for (i = 0; i < Math.min(k+1, n); i++) {
            if (set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }

        while (i < n) {
            set.remove(nums[j]);
            j++;

            if (set.contains(nums[i])) return true;
            else set.add(nums[i]);

            i++;
        }

        return false;
    }
}