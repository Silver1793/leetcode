import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(); // HashSet to contain all vowels

        // Ugly but add both lower and upper case vowels to hashset
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        ArrayList<Character> vowelTrack = new ArrayList<>(); // Array to keep track of vowels

        for (int i = 0; i < s.length(); i++) { // Adds all vowels in s to vowelTrack
            char temp = s.charAt(i);
            if (!vowels.contains(temp))
                continue;
            vowelTrack.add(temp);
        }

        int count = vowelTrack.size() - 1; // count to keep track of location in vowelTrack Array starting at the end
        StringBuilder str = new StringBuilder("");// String builder to rebuild string for java

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!vowels.contains(temp)) { // if not vowel we append and continue
                str.append(temp);
                continue;
            }
            str.append(vowelTrack.get(count--));// when we see a vowel we add the vowel from the arraylist instead using
                                                // reverse order
        }
        return str.toString();
    }
}

class SolutionAlt {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(); // Hashset for vowel

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int i = 0;
        int j = s.length() - 1;

        char[] strChar = s.toCharArray(); // turns s to a array fro rebuilding

        while (i < j) {
            while (i < j && !vowels.contains(s.charAt(i))) {// continues increasing pointer until we reach earliest
                                                            // unseen vowel
                i++;
            }
            while (i < j && !vowels.contains(s.charAt(j))) // continues decreasing pointer until we reach latest unseen
                                                           // vowel
                j--;
            char temp = s.charAt(j);
            strChar[j] = strChar[i];// swaps the two vowels at start and end pointers
            strChar[i] = temp;
            i++; // increase and decrease pointers to not get stuck
            j--;
        }
        return new String(strChar); // returns char array as a string
    }
}