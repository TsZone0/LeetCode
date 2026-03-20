class Solution {
    public boolean detectCapitalUse(String word) {
        
            boolean isSecondUpper = word.length() > 1 && Character.isUpperCase(word.charAt(1));
            
            for(int i=1; i<word.length(); i++){
                if(Character.isUpperCase(word.charAt(i)) != isSecondUpper){
                    return false;
                }
            }

            return !isSecondUpper || Character.isUpperCase(word.charAt(0));
    }
}