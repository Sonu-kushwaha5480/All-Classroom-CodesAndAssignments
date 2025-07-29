import java.util.Scanner;

public class Greatest_IntegerX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
        long n= sc.nextLong();
        long k=sc.nextLong();
        long lo=0;
        long hi=n;
        long ans=-1;
        while (lo<=hi) {
            long mid = (lo+hi)/2;
            if (Math.pow(mid, k)<=n) {
                ans = mid;
                lo= mid+1;
            }
            else{
                hi= mid-1;
            }
        }
        System.out.println(ans);
        }
        
    }
}
