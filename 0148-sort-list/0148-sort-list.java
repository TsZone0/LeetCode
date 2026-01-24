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
 import java.util.Arrays;
 import java.util.Collections;
 import java.util.ArrayList;
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        list.sort();
        int i = 0;
        
        while(head!=null){
            head.val = list.get(i);
            i++;
            head = head.next;
        }

        
       return head; 
    }
}