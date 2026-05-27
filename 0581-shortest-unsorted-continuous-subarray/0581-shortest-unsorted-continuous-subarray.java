class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int[] temp = nums.clone();

        Arrays.sort(temp);

        int start = 0;
        int end = nums.length - 1;


        while(start < nums.length && nums[start] == temp[start]) {
            start++;
        }

        if(start == nums.length) {
            return 0;
        }


        while(end >= 0 && nums[end] == temp[end]) {
            end--;
        }

        return end - start + 1;
    }
}