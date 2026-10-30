class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int result =0;
        for(int i=0; i<accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++) {
                max = max+accounts[i][j];
         }
                result = Math.max(result,max);
                max = 0;
        }
        return result;
    }
}