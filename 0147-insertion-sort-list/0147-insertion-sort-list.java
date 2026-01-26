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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(list);

        ListNode result = head;
        int i = 0;
        while(result!=null){
            result = list.get(i);
            i++;
            result = result.next;
        }

    return head;
        
    }
}