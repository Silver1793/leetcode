import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) { // Adds everything to priority queue
            pq.add(nums[i]);
            list.add(nums[i]); // Adds everything to list in same order as nums
        }
        for (int i = 0; i < nums.length - k; i++) { // O(N^2) time since removing from list reorders everything, can be
                                                    // improved with map
            list.remove(pq.remove()); // removes the first nums.length-k elelements so that only k elements are left
        }
        int[] ret = new int[k];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i); // transfer from array list to array
        }
        return ret;
    }
}