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
        Collections.sort(list);
        int i = 0;
        
        ListNode temp2 = head;
        while(temp2!=null){
            temp2.val = list.get(i);
            i++;
            temp2 = temp2.next;
        }

        
       return head; 
    }
}