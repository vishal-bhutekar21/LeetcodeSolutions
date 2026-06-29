package DSA.june29;

import java.util.ArrayList;

public class reverseLinkedLIst {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;

        // Store all values
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        // Overwrite values in reverse order
        curr = head;

        for (int i = list.size() - 1; i >= 0; i--) {
            curr.val = list.get(i);
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {

        reverseLinkedLIst obj = new reverseLinkedLIst();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = obj.reverseList(head);

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}