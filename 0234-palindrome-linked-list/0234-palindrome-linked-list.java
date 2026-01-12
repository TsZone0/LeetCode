class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // 1) Find middle using slow & fast pointer
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // If length is odd, skip the middle node
        if (fast != null) {
            slow = slow.next;
        }

        // 2) Reverse second half
        ListNode secondHalf = reverseList(slow);

        // 3) Compare first half and second half
        ListNode firstHalf = head;
        ListNode tempSecond = secondHalf;

        while (tempSecond != null) {
            if (firstHalf.val != tempSecond.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // 4) Optional: restore the list (good practice)
        // reverseList(secondHalf);

        return true;
    }

    // Reverse linked list function
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
