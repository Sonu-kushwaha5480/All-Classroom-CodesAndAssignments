import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        int nst = 2*n-1;
        int nsp =0;
        while (row<=n) {
            int csp=0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;                
            }         
            int cst=0;
            while (cst<nst) {
                System.out.print("* ");
                cst++;
            }   
            System.out.println();
            nsp++;
            nst-=2;
            row++;
        }

    }
}
