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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                less.add(temp.val);
            }else{
                greater.add(temp.val);
            }
            temp = temp.next;

        }
        int i=0;
        ListNode temp2 = head;
        while(i!=less.size()){
            temp2.val = less.get(i);
            i++;
            temp2 = temp2.next;
        }
        int j=0;
        while(j!=greater.size()){
            temp2.val = greater.get(j);
            j++;
           temp2 = temp2.next;
        }

        return head;
    }
}