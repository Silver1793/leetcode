import java.util.*;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stackS.isEmpty())
                    stackS.pop();
                else
                    continue;
            } else {
                stackS.push(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!stackT.isEmpty())
                    stackT.pop();
                else
                    continue;
            } else {
                stackT.push(t.charAt(i));
            }
        }
        while (!stackS.isEmpty() && !stackT.isEmpty()) {
            if (stackS.pop() != stackT.pop())
                return false;
        }
        return stackS.isEmpty() && stackT.isEmpty();
    }
}