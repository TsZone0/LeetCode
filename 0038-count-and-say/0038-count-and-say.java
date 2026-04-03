class Solution {
    public String countAndSay(int n) {
        String s = "1"; 

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;

            while (j < s.length()) {
                char current = s.charAt(j);
                int count = 0;
                while (j < s.length() && s.charAt(j) == current) {
                    count++;
                    j++;
                }

                sb.append(count);
                sb.append(current);
            }

            s = sb.toString(); 
        }

        return s; 
    }
}