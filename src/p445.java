import java.util.*;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> first = new Stack<>(); // stack for l1
        Stack<Integer> sec = new Stack<>(); // stack for l2

        while (l1 != null) { // push everything from l1
            first.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) { // push everything from l2
            sec.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0; // carry for greater than 10
        ListNode ret = new ListNode(0);
        ListNode dummy = ret;
        while (!first.isEmpty() && !sec.isEmpty()) {
            int add = first.pop() + sec.pop() + carry;// add from both stacks and add carry
            ListNode temp = new ListNode(add % 10); // take the ones digit
            ret.next = temp;
            ret = ret.next;
            carry = add / 10; // set carry if after adding it is greater than 10
        }
        while (!first.isEmpty()) { // if l1 is greater than l2
            int put = first.pop() + carry; // pop first and add carry
            ListNode temp = new ListNode(put % 10); // input ones place
            carry = put / 10; // reset carry
            ret.next = temp;
            ret = ret.next;
        }
        while (!sec.isEmpty()) { // if l2 is greater than l1
            int put = sec.pop() + carry;
            ListNode temp = new ListNode(put % 10);
            carry = put / 10;
            ret.next = temp;
            ret = ret.next;
        }
        if (carry != 0) { // if there is still a carry after adding everything
            ListNode temp = new ListNode(carry); // put carry into new node
            ret.next = temp;
            ret = ret.next;
        }
        return reverseList(dummy.next); // since this will be reversed we need to reverse it
    }

    public ListNode reverseList(ListNode head) { // method to reverse linked list
        ListNode prev = null;
        ListNode dum = head;

        while (dum != null) {
            ListNode temp = dum.next;
            dum.next = prev;
            prev = dum;
            dum = temp;
        }
        return prev;
    }
}