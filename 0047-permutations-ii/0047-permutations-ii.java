class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];

        List<List<Integer>> result = new ArrayList<>();
        permute(nums,new ArrayList<>(),used, result);
        return result;
        
    }
    public void permute( int[] nums, List<Integer>curr, boolean[] used ,List<List<Integer>> result){
        if(curr.size()==nums.length){
                result.add(new ArrayList<>(curr));
                return;
        }

        for(int i= 0; i<nums.length; i++){
             if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            if(used[i]){
                continue;
            }
            used[i] = true;
            curr.add(nums[i]);
            permute( nums, curr,used, result);
            curr.remove(curr.size()-1);
            used[i]= false;
        }
    }
}