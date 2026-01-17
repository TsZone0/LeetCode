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
    public int getDecimalValue(ListNode head) {


        int result = 0;
        while(head!=null){
            result = result*2+head.val;
            head = head.next;
        }

        return result;
        // StringBuilder sb = new StringBuilder();
        // ListNode temp = head;
        // while(temp!=null){
        //     sb.append(temp.val);
        //     temp = temp.next;
        // }
        // int n = Integer.parseInt(sb.toString(), 2);
        // return n;
    }
}


