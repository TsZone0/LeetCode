class Solution {
    public boolean search(int[] nums, int target) {
     Arrays.sort(nums);
     for(int val:nums){
        if(val==target){
            return true;
        }
     }
     return false;
    }
}