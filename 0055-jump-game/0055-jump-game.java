class Solution {
    public boolean canJump(int[] nums) {
        int finalp = nums.length-1;

        for(int idx = nums.length-2; idx>=0 ; idx--){
            if(idx+nums[idx]>=finalp){
                finalp = idx;
            }
        }

        return finalp==0;
    }

}