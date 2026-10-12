
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        int m = nums2.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (map.containsKey(nums2[i])) {
                list.add(nums2[i]);

                if (map.get(nums2[i]) == 1) {
                    map.remove(nums2[i]);
                } else {
                    map.put(nums2[i], map.get(nums2[i]) - 1);
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
