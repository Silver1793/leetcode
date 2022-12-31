class NumArray {
    private int[] arr;

    public NumArray(int[] nums) {
        arr = nums;
        for (int i = 1; i < nums.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return arr[right];
        return arr[right] - arr[left - 1];
    }
}

class NumArray2 {
    private int[] arr;

    public NumArray2(int[] nums) {
        arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int total = 0;
        while (left <= right) {
            if (left == right)
                total += arr[left++];
            else {
                total += arr[left++];
                total += arr[right--];
            }
        }
        return total;
    }
}