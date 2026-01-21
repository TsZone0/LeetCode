/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

            ListNode slow = head;
            ListNode fast = head.next;

            // find middle

            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

            }

            ListNode mid = slow;
            
            //reverse list in a middle
            ListNode curr = mid.next;
            mid.next = null;
            ListNode prev = null;
            ListNode next;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }

            //zigzag
            ListNode left = head;
            ListNode right = prev;
            ListNode nextL;
            ListNode nextR;

            while(left!=null && right!=null){
                nextL = left.next;
                left.next = right;
                nextR  = right.next;
                right.next = nextL;


                left = nextL;
                right = nextR;
            }

    }
}