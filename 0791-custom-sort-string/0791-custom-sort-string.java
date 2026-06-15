class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[s.length()];


        for (int i = 0; i < order.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (order.charAt(i) == s.charAt(j)) {
                    sb.append(s.charAt(j));
                    used[j] = true;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!used[i]) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}