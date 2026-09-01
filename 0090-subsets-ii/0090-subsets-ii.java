class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       HashSet<List<Integer>> comb = new HashSet<>();
        subset(0,new ArrayList<>(),nums,comb);
        return new ArrayList<>(comb);
    }
    public void subset(int start,List<Integer>current,int[] nums,HashSet<List<Integer>> comb  ){

        comb.add(new ArrayList<>(current));
        for(int i=start; i<nums.length; i++){
            current.add(nums[i]);
            subset(i + 1, current, nums, comb);
            current.remove(current.size()-1);
        }
    }
}