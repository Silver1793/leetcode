import java.util.*;

class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2)
            return "";
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (set.contains(Character.toUpperCase(temp)) && set.contains(Character.toLowerCase(temp))) {
                continue;
            } else {
                String first = longestNiceSubstring(s.substring(0, i));
                String sec = longestNiceSubstring(s.substring(i + 1));
                if (first.length() >= sec.length())
                    return first;
                return sec;
            }
        }
        return s;
    }
}