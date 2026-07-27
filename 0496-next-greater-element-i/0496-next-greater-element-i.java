class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for(int val: nums2){
            while(!s.isEmpty() && s.peek()<val){
                map.put(s.pop(), val);

            }
            s.push(val);
        }

        int [] result = new int[nums1.length];
        for(int i=0; i<nums1.length;i++){
            result[i]= map.getOrDefault(nums1[i],-1);
        }

        return result;

    }
}