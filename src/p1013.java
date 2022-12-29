class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;// total of all elements in arr
        int first, sec, third; // counts for the segments
        first = sec = third = 0;
        boolean fFlag, sFlag, tFlag; // flags for the three segments
        fFlag = sFlag = tFlag = false;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        if (total % 3 != 0) // if the total can not be split by 3 return false
            return false;
        for (int i = 0; i < arr.length; i++) {
            if (first != total / 3 || fFlag == false) { // if first segment has not reached total/3 or has not been
                                                        // added to before continue adding
                first += arr[i];
                fFlag = true;
            } else if (sec != total / 3 || sFlag == false) {
                sec += arr[i];
                sFlag = true;
            } else {
                third += arr[i];
                tFlag = true;
            }
        }
        if (fFlag == false || sFlag == false || tFlag == false) // makes sure everything has been added to
            return false;
        if (first == sec && sec == third) // makes sure all segments are equal
            return true;
        else
            return false;
    }
}