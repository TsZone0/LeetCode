class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int count = 0;
        int n = str.length();
        
   
        for (int i = 0; i <= n - k; i++) {
          
            String subStr = str.substring(i, i + k);
            
     
            int divisor = Integer.parseInt(subStr);
            
            
            if (divisor != 0 && num % divisor == 0) {
                count++;
            }
        }
        
        return count;
    }
}