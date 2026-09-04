class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>>result = new HashSet<>();
        set(0,candidates,new ArrayList(),result,target);
        return new ArrayList<>(result);   
    }

    public void set(int start,int[] candidates, List<Integer> curr, HashSet<List<Integer>>result, int target){
        
         if(target==0){
            result.add(new ArrayList(curr));
         }   
         

         for(int i= start; i<candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            curr.add(candidates[i]);
            set(i+1,candidates,curr,result,target-candidates[i]);
            curr.remove(curr.size()-1);
         }
    }
}