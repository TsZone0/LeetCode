// Main.java

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    public ListNode mergeTwoLists(ListNode a, ListNode b) {

        if (a == null) return b;
        if (b == null) return a;

        if (a.val < b.val) {
            a.next = mergeTwoLists(a.next, b);
            return a;
        } else {
            b.next = mergeTwoLists(b.next, a);
            return b;
        }
    }
}

public class two_shorted_list {

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create first sorted list: 1 -> 2 -> 4
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Create second sorted list: 1 -> 3 -> 4
        ListNode b = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution sol = new Solution();
        ListNode merged = sol.mergeTwoLists(a, b);

        System.out.println("Merged List:");
        printList(merged);
    }
}
