public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

        ListNode p1 = headA;
        ListNode p2 = headB;

        int sizeA = 0;
        int sizeB = 0;

        while(p1 != null){
            sizeA++;
            p1 = p1.next;
        }

        while(p2 != null){
            sizeB++;
            p2 = p2.next;
        }

        if(sizeA > sizeB){
            int diff = sizeA - sizeB;
            while(diff > 0){
                headA = headA.next;
                diff--;
            }
        }
        
        else if(sizeB > sizeA){
            int diff = sizeB - sizeA;
            while(diff > 0){
                headB = headB.next;
                diff--;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;   
    }
}
