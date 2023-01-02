class Solution {
    int max = Integer.MIN_VALUE;

    public int maxScore(String s) {
        int[] zeroDp = new int[s.length()]; // array for zeros
        int[] oneDp = new int[s.length()]; // arrays for ones
        if (s.charAt(0) == '0') // sees if the first needs to be a 0 or 1
            zeroDp[0] = 1;
        else
            oneDp[0] = 1;

        for (int i = 1; i < s.length(); i++) {// put in total number of zeros or ones based on index
            if (s.charAt(i) == '0') {
                zeroDp[i] = zeroDp[i - 1] + 1;
                oneDp[i] = oneDp[i - 1];
            } else {
                oneDp[i] = oneDp[i - 1] + 1;
                zeroDp[i] = zeroDp[i - 1];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < zeroDp.length - 1; i++) {
            int numZero = zeroDp[i];
            int numOne = oneDp[s.length() - 1] - oneDp[i];
            max = Math.max(max, numZero + numOne);
        }
        return max;

    }
}