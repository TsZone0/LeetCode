class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        
        int count = 0;
        while (head != null) {
            if (set.contains(head.val)) {
       
                while (head != null && set.contains(head.val)) {
                    head = head.next;
                }
                count++; 
            } else {
                head = head.next;
            }
        }
        return count;
    }
}
