class Solution {
    public boolean check(int[] nums) {
        int decrease = 0;
        int inc = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                inc++;
            }
            if (inc > 1)
                return false;
        }
        return true;
    }
}