class Solution {
    public int countGoodSubstrings(String s) {
        int t = 2;
        int count= 0;
        
        for(int i=0; i<s.length()-2; i++){

             if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(t)&& s.charAt(i)!=s.charAt(t)){
                count++;
                t++;

             }else{
                t++;
             }
        }
            return count;
    }
}