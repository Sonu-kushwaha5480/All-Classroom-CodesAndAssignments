import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nst1=1;
        int nst2=1;
        int nsp=2*n-3;
        int row=1;
        while (row<=n) {
            int val1=1;
            int cst1=0;
            if (row==n) {
                cst1++;
            }
            while (cst1<nst1) {
                System.out.print(val1 +" ");
                val1++;
                cst1++;
            }
            int csp=0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            int val2=row;
            int cst2=0;
            while (cst2<nst2) {
                System.out.print(val2 +" ");
                val2--;
                cst2++;
            }
        System.out.println();
        row++;
        nst1++;
        nst2++;
        nsp-=2;
        }
        
    }
}
