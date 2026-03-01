class Solution {
    public int addDigits(int num) {
        while (num >= 10) {   // jab tak single digit na ho
            int sum = 0;
            
            while (num > 0) {
                sum += num % 10;  // last digit add karo
                num = num / 10;   // last digit remove karo
            }
            
            num = sum;  // new number ban gaya
        }
        
        return num;
    }
}