import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usednumber = new HashSet<>();
        
        while(true){
            int sum = 0;
            while(n != 0){
                sum += Math.pow(n%10 , 2);
                n = n/10;
            }

            if(sum==1){
                return true;
            }else{
            
            }

            if(usednumber.contains(sum)){
                return false;
               
            }else{
                 usednumber.add(sum);
                 n = sum;
            }
        }
    }
}