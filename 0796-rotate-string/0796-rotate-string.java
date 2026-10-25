class Solution {
    public boolean rotateString(String s, String goal) {
            if(s.length()!=goal.length()){
                return false;
            }
        String data = s+s;
        if(data.contains(goal)){
            return true;
        }
        return false;
    }
}