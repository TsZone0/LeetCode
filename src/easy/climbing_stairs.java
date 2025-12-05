package easy;

public class climbing_stairs {
    public static  int toclimbe(int n){
           int a = 1;
            int b = 2;
        if(n<=2){
         return n;

        }
        for(int i=3; i<=n; i++){

            int temp = a+b;
             a = b;
            b = temp;
           
                                                      
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(toclimbe(5));
    }


}