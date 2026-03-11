import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger num11 = new BigInteger(num1);
        BigInteger num22 = new BigInteger(num2);

        BigInteger result = num11.add(num22);

        return result.toString();
    }
}