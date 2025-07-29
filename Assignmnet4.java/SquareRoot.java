import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            long n=sc.nextLong();
            long lo=0;
            long hi=n;
            long ans=-1;
            while (lo<=hi) {
                long mid= lo+(hi-lo)/2;
                if (Math.pow(mid, 2)<=n) {
                    ans =mid;
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
        }
        System.out.print(ans);
    }
}
