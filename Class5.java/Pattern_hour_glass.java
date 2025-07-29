import java.util.Scanner;

public class Pattern_hour_glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nst=2*n+1;
        int nsp=0;
        int row=1;
        // int val=1;
        // int val2=n;
        // int col=2*n+1;
        while (row<=2*n+1) {
                int csp=0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst=0;
            int val=n-nsp;
            while (cst<nst) {
                System.out.print(val + " ");
                if (cst<nst/2) {
                    val++;
                }
                else{
                    val--;
                }
                cst++;
            }
            if (row<n+1) {
                nst-=2;
                nsp++;
            }
            else{
                nst+=2;
                nsp--;
            }
            System.out.println();
            row++;
        }
    }
}
