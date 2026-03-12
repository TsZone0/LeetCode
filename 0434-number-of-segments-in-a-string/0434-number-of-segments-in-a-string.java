import java.util.*;

class Solution {
    public int countSegments(String s) {
        List<String> li = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } 
            else {
                if(sb.length() > 0){
                    li.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }

        if(sb.length() > 0){
            li.add(sb.toString());
        }

        return li.size();
    }
}