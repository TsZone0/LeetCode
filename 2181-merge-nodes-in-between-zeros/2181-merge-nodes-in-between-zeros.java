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
    public ListNode mergeNodes(ListNode head) {
      ListNode dummy = new ListNode(0);
      ListNode tail = dummy;
      ListNode curr = head.next;
     
     int totalsum = 0;
      while(curr!=null){
        if(curr.val!=0){
            totalsum +=curr.val;
        }else{
            tail.next = new ListNode(totalsum);
            tail = tail.next;
            totalsum = 0;
        }
        curr = curr.next;
      }

      return dummy.next;
    }
}