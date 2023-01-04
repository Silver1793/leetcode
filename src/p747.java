class Solution {
    public int dominantIndex(int[] nums) {
        int first = nums[0]; // biggest number
        int sec = -1; // second biggest number
        int index = 0; // index of biggest number
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > first) { // if new element is bigger than biggest
                sec = first; // biggest goes to second biggest
                first = nums[i]; // new element goes to biggest
                index = i; // index is pointed to new element
            } else if (nums[i] > sec) { // if new element is greater than second greatest
                sec = nums[i]; // second greatest is new element
            }
        }
        if (sec * 2 <= first) // if largest is greater or eql to second greatest, it is greater than
                              // everything else as well
            return index;// return index of greatest
        return -1; // return -1
    }
}