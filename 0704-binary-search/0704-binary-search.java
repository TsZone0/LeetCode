class Solution {
    public int binarysearch(int[]nums,int s, int l, int target){
        if (s > l) {
            return -1;
        }
        int mid = s + (l - s) / 2;

        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
           return binarysearch(nums,mid+1,l,target);
        }
        else{
            return binarysearch(nums,s,mid-1,target);
        }
    
    }
    public int search(int[] nums, int target) {
        int val = binarysearch(nums,0,nums.length-1,target);
        return val;

        
    }
}