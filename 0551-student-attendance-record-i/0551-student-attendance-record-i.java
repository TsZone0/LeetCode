class Solution {
    public boolean checkRecord(String s) {
        
        int aCount = 0;
        int lCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == 'A'){
                aCount++;
                if(aCount >= 2){
                    return false;
                }
            }
            
            if(ch == 'L'){
                lCount++;
                if(lCount >= 3){
                    return false;
                }
            } else {
                lCount = 0;  // reset when not L
            }
        }
        
        return true;
    }
}