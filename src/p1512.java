import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int ret = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) == false)
                map.put(nums[i], 1);
            else {
                ret += map.get(nums[i]);
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return ret;
    }
}