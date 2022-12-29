class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] map = new int[26];
        int[] temp = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            map[chars.charAt(i) - 'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                temp[words[i].charAt(j) - 'a']++;
                if (temp[words[i].charAt(j) - 'a'] > map[words[i].charAt(j) - 'a'])
                    break;
                if (j == words[i].length() - 1) {
                    count += words[i].length();
                }
            }
            for (int j = 0; j < temp.length; j++) {
                temp[j] = 0;
            }
        }
        return count;
    }
}