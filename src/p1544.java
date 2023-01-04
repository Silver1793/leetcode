import java.util.*;

class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) { // if stack is empty push on new character
                stack.push(s.charAt(i));
                continue;
            }
            char compare = s.charAt(i);
            if (Character.isUpperCase(stack.peek())) { // if the previous character is uppercase
                if (Character.toLowerCase(stack.peek()) == compare) { // change to lower case and if it equals current
                                                                      // character
                    stack.pop(); // pop
                    continue;
                }
            } else if (Character.isLowerCase(stack.peek())) { // if previouse character is lower case
                if (Character.toUpperCase(stack.peek()) == compare) { // change to uppercase and if it equals current
                    stack.pop(); // pop
                    continue;
                }
            }
            stack.push(compare); // otherwise push on new character
        }
        StringBuilder str = new StringBuilder("");
        while (!stack.isEmpty()) {
            str.append(stack.pop()); // push characters to string builder
        }
        str.reverse(); // reverse string
        return str.toString();
    }
}