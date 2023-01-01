import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort array
        Arrays.sort(s); // sort array

        int i = 0;
        int j = 0;
        int ret = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) { // compare the smallest cookie with smallest greed
                i++;
                j++;
                ret++;

            } else { // if not possilbe, increase cookie size
                j++;
            }
        }
        return ret;
    }
}