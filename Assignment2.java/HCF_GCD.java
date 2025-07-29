import java.util.Scanner;

public class HCF_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int divisorN1=sc.nextInt();
        int dividendN2=sc.nextInt();
        while (dividendN2%divisorN1>0) {
            int r= dividendN2%divisorN1;

            dividendN2=divisorN1;
            divisorN1=r;
        }
        System.out.println(divisorN1);
    }
}
