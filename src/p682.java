import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
                continue;
            } else if (operations[i].equals("D")) {
                stack.push(stack.peek() * 2);
                continue;
            } else if (operations[i].equals("+")) {
                int temp = stack.pop();
                int total = stack.peek() + temp;
                stack.push(temp);
                stack.push(total);
                continue;
            }
            stack.push(Integer.parseInt(operations[i]));
        }
        int ret = 0;
        while (!stack.isEmpty()) {
            ret += stack.pop();
        }
        return ret;
    }
}