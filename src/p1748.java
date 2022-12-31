import java.util.*;

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // hashmap to keep track of frequency
        int ret = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); // put everything in the hashmap with the amount of
                                                                // times its in there
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) { // if only 1 frequency we add to ret
                ret += nums[i];
            }
        }
        return ret;
    }
}
