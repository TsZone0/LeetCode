class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        for(int i=0; i<nums.length; i++){
             sum = sum + nums[i];
            while(sum>=target){
                 result = Math.min(result, i-low+1);
                 sum = sum-nums[low];
                 low++;
            }
        }
       return result == Integer.MAX_VALUE ? 0 : result;
    }
}