import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> strToChar = new HashMap<>(); // HashMap for string to character conversion
        HashMap<Character, String> charToStr = new HashMap<>(); // HashMap for character to string conversion
        String[] temp = s.split(" ");
        if (pattern.length() != temp.length) // if the pattern length and the number of words in s are diff we can
                                             // return false
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (charToStr.containsKey(pattern.charAt(i))) { // Checks if character maps to something
                if (!temp[i].equals(charToStr.get(pattern.charAt(i)))) // if it does and it is not the current word
                                                                       // return false
                    return false;
            } else {
                charToStr.put(pattern.charAt(i), temp[i]);
            }
            if (strToChar.containsKey(temp[i])) { // Checks if word maps to character
                if (strToChar.get(temp[i]) != pattern.charAt(i)) { // If it does and it is not current character return
                                                                   // false
                    return false;
                }
            } else {
                strToChar.put(temp[i], pattern.charAt(i));
            }
        }
        return true; // Passes all conditions return true
    }
}
