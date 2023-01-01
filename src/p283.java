class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0; // pointer for where zeros are

        for (int i = 0; i < nums.length; i++) {
            if (nums[zeroCount] != 0) {// continue iterating until we find the first zero
                zeroCount++;
                continue;
            }
            if (nums[i] != 0) {// if zeroCount is at a 0 and i is not we swap
                nums[zeroCount++] = nums[i];
                nums[i] = 0;
            }
        }
    }
}