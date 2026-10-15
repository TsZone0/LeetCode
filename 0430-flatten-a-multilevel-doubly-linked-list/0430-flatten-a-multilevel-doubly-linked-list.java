/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null ){
            return null;
        }
        Node curr = head;
        while(curr!=null){
           if(curr.child!=null){
            Node nextnode = curr.next;
            Node childnode = curr.child;

            curr.next = childnode;
            childnode.prev = curr;
            curr.child = null;

            Node temp = childnode;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = nextnode;
            if(nextnode!=null){
                nextnode.prev = temp;
            }
            }
            curr = curr.next;

        }

        return head;
 
    }
}