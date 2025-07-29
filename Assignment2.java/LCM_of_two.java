import java.util.Scanner;
public class LCM_of_two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g= HCF_GCD(a,b);
        // Product(a, b);

        int LCM= (a*b)/g;
        System.out.print(LCM);
    }

    public static int HCF_GCD(int a, int b) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        while (b%a>0) {
            int r= b%a;

            b=a;
            a=r;
            
        }
        int hcf=a;
        // System.out.println(hcf);
        return hcf;
    }
    // public static void Product(int a, int b) {
    //     Scanner sc=new Scanner(System.in);
    //     int e=sc.nextInt();
    //     int f=sc.nextInt();
    //     int product=e*f;
    //     System.out.print(product);
    // }
}
