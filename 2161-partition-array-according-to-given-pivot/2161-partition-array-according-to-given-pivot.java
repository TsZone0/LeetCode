class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] list  = new int[nums.length];
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                list[j] = nums[i];
                j++;
            }
        }
            for(int i=0; i<nums.length; i++){
            if(nums[i]==pivot){
                list[j]=nums[i];
                j++;
            }
        }
                for(int i=0; i<nums.length; i++){
            if(nums[i]>pivot){
                list[j] = nums[i];
                j++;
            }
        }
        return list;
    }
}