class Solution {
    public int addDigits(int num) {

        if(num == 0){
            return 0;
        }

        int sum = 0;

        while(num > 0){
            int res = num % 10;
            sum = sum + res;
            num = num / 10;
        }

        if(sum > 9){
            return addDigits(sum);
        }

        return sum;
    }
}
