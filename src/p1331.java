import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone(); // clones arr so sort will not affect arr
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 1; // rank counter

        Arrays.sort(temp); // sorts o(nlogn)

        for (int i = 0; i < temp.length; i++) { // starting at smallest, adds unique elements with rank
            if (map.containsKey(temp[i]))
                continue;
            map.put(temp[i], count++);
        }
        int[] ret = new int[arr.length];

        for (int i = 0; i < arr.length; i++) { // uses original array for the original positions
            ret[i] = map.get(arr[i]);
        }
        return ret;
    }
}