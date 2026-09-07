class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        sublist(1,n,k,new ArrayList<>(),result);
        return result;
    }

    public void sublist(int start, int n, int k, List<Integer> curr, List<List<Integer>> result){
        if(curr.size()==k){
            result.add(new ArrayList(curr));
            return;
        }
        for(int i=start; i<=n; i++){
            curr.add(i);
            sublist(i+1, n,k,curr,result);
            curr.remove(curr.size()-1);
        }
    }
}
