class Solution {
    public boolean detectCapitalUse(String word) {
        
        // First 2 letters se pattern decide karo
        boolean isSecondUpper = word.length() > 1 && Character.isUpperCase(word.charAt(1));
        
        for(int i = 1; i < word.length(); i++){
            
            // agar pattern break hua to false
            if(Character.isUpperCase(word.charAt(i)) != isSecondUpper){
                return false;
            }
        }
        
        // agar second letter uppercase hai to first bhi uppercase hona chahiye
        return !isSecondUpper || Character.isUpperCase(word.charAt(0));
    }
}