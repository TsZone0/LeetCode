import java.util.*;

class Solution {
    public String reverseWords(String s) {
        Stack<Character> s1 = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                s1.push(ch);
            } else {
                while(!s1.isEmpty()) {
                    sb.append(s1.pop());
                }
                sb.append(' ');
            }
        }

        // last word handle karna zaroori hai
        while(!s1.isEmpty()) {
            sb.append(s1.pop());
        }

        return sb.toString();
    }
}