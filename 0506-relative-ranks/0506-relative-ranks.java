class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = Arrays.copyOf(score, score.length);
        Arrays.sort(arr);
        HashMap<Integer,String> set = new HashMap<>();
        int n = score.length;
        for(int i=n-1; i>=0; i--){
            int rank = n-i;
            if(rank==1){
                set.put(arr[i],"Gold Medal");
            }
            else if(rank==2){
                set.put(arr[i],"Silver Medal");
            }
            else if(rank==3){
                set.put(arr[i],"Bronze Medal");

            }
            else{
                set.put(arr[i],String.valueOf(rank));
            }
        }
        String[] result =new String[n];
        for(int i=0; i<n; i++){
            result[i] = set.get(score[i]);
        }
        return result;
    }
}