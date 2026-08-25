class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> comb = new ArrayList<>();
        subset(0,new ArrayList<>(),nums,comb);
        return comb;
    }
    public void subset(int start,List<Integer>current,int[] nums,List<List<Integer>> comb  ){
        comb.add(new ArrayList<>(current));
        for(int i=start; i<nums.length; i++){
            current.add(nums[i]);
            subset(i + 1, current, nums, comb);
            current.remove(current.size()-1);
        }
    }
}