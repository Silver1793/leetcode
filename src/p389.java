class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26]; // hash map for characters

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++; // number of occurences for each letter
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--; // decrement if character is in t
            if (arr[t.charAt(i) - 'a'] < 0) // if negative we have a character we dont have in s
                return t.charAt(i);
        }
        return 'a';
    }
}