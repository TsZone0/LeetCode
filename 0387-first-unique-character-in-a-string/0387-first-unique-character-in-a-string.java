import java.util.*;

class Solution {
    public int firstUniqChar(String s) {

    int all[] = new int[26];

    // all 
    for(int i=0; i<s.length(); i++){
        all[s.charAt(i)-'a']++;
    }

    //find first uniqe number
    for(int i=0; i<s.length(); i++){
        if(all[s.charAt(i)-'a']==1){
            return i;
        }
    }
    return -1;
    }
}