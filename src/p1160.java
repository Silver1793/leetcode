class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] map = new int[26]; // map that stores all of the characters from chars
        int[] temp = new int[26]; // temp map used to store the letters in the words of words array
        for (int i = 0; i < chars.length(); i++) {
            map[chars.charAt(i) - 'a']++; // initialize map with characters in chars
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                temp[words[i].charAt(j) - 'a']++;
                if (temp[words[i].charAt(j) - 'a'] > map[words[i].charAt(j) - 'a']) // if there are more letters than
                                                                                    // available we skip this word
                    break;
                if (j == words[i].length() - 1) {
                    count += words[i].length(); // If everything has been added we add the word length to count
                }
            }
            for (int j = 0; j < temp.length; j++) { // resets temp every new word
                temp[j] = 0;
            }
        }
        return count;
    }
}