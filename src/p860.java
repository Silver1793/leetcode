class Solution {
    public boolean lemonadeChange(int[] bills) {
        int num5 = 0; // keep track of 5s
        int num10 = 0; // keep track of 10s
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) // if given 5 no change needed, increment num of 5
                num5++;
            else if (bills[i] == 10) { // if 10 is given, only possible change is 5
                num5--; // give 1 5 back
                num10++; // incremenet number of 10s
            } else { // otherwise they gave 20
                if (num10 > 0) { // if we have 10s start with giving 10
                    num10--;
                    num5--;
                } else { // otherwise make change with 3 5s
                    num5 -= 3;
                }
            }
            if (num5 < 0 || num10 < 0) // if at any moment the number of 5s or number of 10s is negative it is
                                       // impossible to give change
                return false;
        }
        return true;
    }
}