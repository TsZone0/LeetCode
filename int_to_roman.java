class int_to_roman{
    public String into(int num){
        String[] sym = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] val = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder sb = new StringBuilder();
        int idx = val.length-1;

        while(num>0 && idx>=0){
            if(num<val[idx]){
                idx = idx-1;
            }else{
                num = num-val[idx];
                sb.append(sym[idx]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int_to_roman t1 = new int_to_roman();
        System.out.println(t1.into(5));
    }
}