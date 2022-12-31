class Solution {
    public int numberOfSteps(int num) {// Can probably make this logn using while loop
        int[] dp = new int[num + 1];

        if (num == 0)
            return 0;
        if (num == 1)
            return 1;

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) { // if we can divide by 2
                dp[i] = Math.min(dp[i / 2] + 1, dp[i - 1] + 1); // take the min between -1 and dividing by 2 and add 1
                                                                // extra step to it
            } else
                dp[i] = dp[i - 1] + 1; // take how many steps from -1 and add 1 to it
        }
        return dp[num];
    }
}