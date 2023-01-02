import java.util.*;

class Solution {
    public String removeDuplicates(String s) {
        ArrayList<Character> list = new ArrayList<>(); // sudo stack

        int count = 0; // keep track of index in list

        for (int i = 0; i < s.length(); i++) {
            if (count == 0) { // if our list is empty push element on since it is impossible for there to be
                              // duplicate
                list.add(s.charAt(i));
                count++;
                continue;
            }
            char temp = list.get(count - 1); // get top element, sudo peek
            if (temp == s.charAt(i)) { // if current element in s is equal to our peek remove
                list.remove(count - 1);
                count--; // decrement index counter for list
            } else {
                list.add(s.charAt(i)); // if not duplicate just add
                count++;
            }
        }
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < count; i++) { // add everything left over into a string
            str.append(list.get(i));
        }
        return str.toString();
    }
}