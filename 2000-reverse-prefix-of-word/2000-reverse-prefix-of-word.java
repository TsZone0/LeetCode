import java.util.*;

class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int i = 0;


        while(i < word.length() && word.charAt(i) != ch){
            s.push(word.charAt(i));
            i++;
        }

        if(i == word.length()){
            return word;
        }


        s.push(word.charAt(i));


        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        for(int k = i + 1; k < word.length(); k++){
            sb.append(word.charAt(k));
        }

        return sb.toString();
    }
}