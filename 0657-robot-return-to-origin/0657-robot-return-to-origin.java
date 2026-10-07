class Solution {
    public boolean judgeCircle(String moves) {
        int up= 0;
        int down=0;

        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='U'){
                up++;
            }else if(moves.charAt(i)=='D'){
                up--;
            }else if(moves.charAt(i)=='R'){
                down++;
            }else{
                down--;
            }

        }
        if(up==0 && down==0){
            return true;
        }
        return false;
        
    }
}