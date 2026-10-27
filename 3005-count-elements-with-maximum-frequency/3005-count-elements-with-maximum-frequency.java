class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i],1);
            }else{
                freq.replace(nums[i], freq.get(nums[i]) + 1);

            }
        }
        if(freq.size()==nums.length){
            return nums.length;
        }

        int mf = 0;
        for (int val:freq.values()){
            if(val>mf){
                mf = val;
            }
        }
        int result = 0;
        for(int val:freq.values()){
            if(val==mf){
                result= result+val;
            }
        }
        return result;
    }
}