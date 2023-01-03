class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 1) // if length is less than or eql 1 impossible for mountain
            return false;
        if (arr[1] < arr[0]) // if start out decreasing impossible for mountain
            return false;
        boolean flag = false; // flag to set for when decreasing starts
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && flag == true) { // if already decreasing and an increase is seen return false
                return false;
            }
            if (arr[i] < arr[i - 1]) { // if decrease starts set flag to true
                flag = true;
            }
            if (arr[i] == arr[i - 1]) // if equal ever return false
                return false;
        }
        return true && flag;
    }
}