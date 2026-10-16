

class Solution {
    public int maximumLengthSubstring(String s) {
        int result = 0;
        int p = 0;
        int end = 0; 

    
        while (end < s.length()) {
            int c = 1; 
            int internal = p;

            while (internal < end) {
                if (s.charAt(internal) == s.charAt(end)) {
                    c++;
                }
                internal++; 
            }

   
            if (c > 2) {
                p++;
                end = p; 
            } else {

                result = Math.max(result, end - p + 1);
                end++;
            }
        }
        return result;
    }
}
