class Solution {
    public int countDigitOne(int n) {
        int count = 0;

    for(int i=1; i<=n; i*=10){
        long high= n/i;
        long low = n%i;

        count +=(high+8)/10*i;

        if (high % 10 == 1) {
                count += low + 1;
            }
    }
    return count;
    }
}