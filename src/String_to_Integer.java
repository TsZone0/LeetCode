public class String_to_Integer {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int i=0;
        int sign = 1;
        int n = s.length();
        long num = 0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            if(s.charAt(i)=='-'){
                sign = -1;
            }else{
                sign = 1;
            }
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            num = num*10+(s.charAt(i)-'0');

            if(num*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)num*sign;

    }

    public static void main(String[] args) {
        String s = "4657GHg";
        String_to_Integer t1 = new String_to_Integer();
        System.out.println(t1.myAtoi(s));
    }
}