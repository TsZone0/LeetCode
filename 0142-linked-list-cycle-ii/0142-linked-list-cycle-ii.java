/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
          if (head == null || head.next == null) {
            
            return null;
        }
      
        ListNode temp = head;
        ListNode temp2 = head;
        while(temp2 != null && temp2.next!=null){
             temp = temp.next;
             temp2 = temp2.next.next;
             if(temp==temp2){
                break;
             }
        }
            if(temp2==null || temp2.next==null){
                return null;
            }
            temp2 = head;

            while(temp!=temp2){
                temp = temp.next;
                temp2 = temp2.next;
            }
        
        return temp;
    }
}