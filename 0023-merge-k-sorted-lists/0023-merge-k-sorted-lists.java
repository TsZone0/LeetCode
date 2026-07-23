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
    public ListNode mergeKLists(ListNode[] lists) {
        LinkedList<Integer> result = new LinkedList<>();
        for(int i=0; i<lists.length; i++){
            ListNode temp = lists[i];
            while(temp!=null){
                result.add(temp.val);
                temp = temp.next;
            }

        }
        Collections.sort(result);
        ListNode list2 = new ListNode(0);
        ListNode temp = list2;

        for(int val: result){
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return list2.next;
    }
}