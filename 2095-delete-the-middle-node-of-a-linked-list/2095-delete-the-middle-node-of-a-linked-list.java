class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; 
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode slowPrev = null;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slowPrev = slow;
            slow = slow.next;
        }
        

        slowPrev.next = slow.next;
        
        return head;
    }
}
