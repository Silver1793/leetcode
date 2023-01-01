import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            if (stack.isEmpty()) // if theres nothing to compare in the stack, just push element
                stack.push(nums2[i]);
            else {
                while (!stack.isEmpty() && stack.peek() < nums2[i]) { // keep removing elements on the stack since they
                                                                      // are smaller and previous
                    map.put(stack.pop(), nums2[i]); // put comparisons in hashmap
                }
                stack.push(nums2[i]); // push our new element at the end
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {// if the element was in map, we have another element greater than it
                arr[i] = map.get(nums1[i]);
            } else { // if it is not in map, we do not have a greater element, put -1
                arr[i] = -1;
            }
        }
        return arr;
    }
}