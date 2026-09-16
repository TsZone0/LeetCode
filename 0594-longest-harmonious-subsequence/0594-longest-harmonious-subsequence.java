class Solution {
    public int findLHS(int[] nums) {
     Arrays.sort(nums);
     int low = 0;
     int result = 0;
     for(int i=0; i<nums.length; i++){
        while(nums[i]-nums[low]>1){
            low++;
        }

        if(nums[i]-nums[low]==1){
            result = Math.max(result,i-low+1);
            
        }
     }
        return result;
    }
}

