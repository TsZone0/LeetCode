class Solution {
    public String[] findRelativeRanks(int[] score) {
        int arr2[] = Arrays.copyOf(score,score.length);
        Arrays.sort(arr2);
        HashMap<Integer,String> rankMap = new HashMap<>();
        int n = score.length;

        for(int i=n-1; i>=0; i--){
            int rank = n-i;
            if(rank==1){
                rankMap.put(arr2[i], "Gold Medal");
            }
            else if (rank == 2) {
                rankMap.put(arr2[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(arr2[i], "Bronze Medal");
            } else {
                rankMap.put(arr2[i], String.valueOf(rank));
            }
        }
        String[] result = new String[n];
        for(int i=0; i<n; i++){
            result[i] = rankMap.get(score[i]);
        }
        return result;
    }
}