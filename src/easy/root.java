package easy;

public class root {
    public static int toroot(int n){
        long start = 1;
        long end = n;
        long ans =0;

        while(start<=end){
            long mid = start+ (end-start)/2;
            if(mid*mid==n){
                ans = (int)mid;
                break;
            }else if(mid*mid<n){
                start = mid+1;
                ans = mid;
            } else{
                end = mid-1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(toroot(67));
    }
}
