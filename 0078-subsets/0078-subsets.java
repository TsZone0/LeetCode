import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    subset(0,nums, new ArrayList<>(),result);
    return result;
    }

    public void subset(int start,int[] size,ArrayList<Integer>curr,List<List<Integer>> result){
        result.add(new ArrayList(curr));
        for(int i= start;i<size.length; i++){
            curr.add(size[i]);
            subset(i+1,size,curr,result);
            curr.remove(curr.size()-1);
        }

        
    }
}