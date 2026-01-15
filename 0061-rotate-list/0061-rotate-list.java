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
    public ListNode rotateRight(ListNode head, int k) {
        
    ArrayList<Integer> list = new ArrayList<>();
    ListNode temp = head;
    if(head==null){
        return null;
    }

    while(temp!=null){
        list.add(temp.val);
        temp = temp.next;
    }

    int n = list.size();
  
    k = k%n;
    ArrayList<Integer> revers = new ArrayList<>();
    
    int start = n-k;
    int i = start;
    
    while(i<n){
        revers.add(list.get(i));
        i++;
    }

    i = 0;
    while(i<start){
        revers.add(list.get(i));
        i++;
    }
    //add element in linked list
    i = 0;
    temp = head;
    while(temp!=null){
        temp.val = revers.get(i);
        temp = temp.next;
        i++;
    }
    return head;

    }
}