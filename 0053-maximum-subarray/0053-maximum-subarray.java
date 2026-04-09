class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp = nums[0];
        for(int i=1;i<nums.length; i++){
            temp = Math.max(nums[i],temp+nums[i]);
            max = Math.max(max,temp);

        }
        return max;
    }
}