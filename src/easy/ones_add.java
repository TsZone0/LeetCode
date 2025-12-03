package easy;

import java.util.Arrays;

public class ones_add {
    public static void main(String[] args) {
        int[] digits = {2,4,2,4};
        System.out.println(Arrays.toString(plusones(digits)));
    }

    static int[] plusones(int[] digits){
        int n = digits.length;
        for(int i= n-1; i>0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;

          }
            digits[i] = 0;
        }

            int[] newnum = new int[n+1];
            newnum[0] = 1;
            return newnum;
        
        
    }
}
