import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp =0;
        int nst = n;
        int row = 1;
        while (row<=n) {
            int csp = 0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;                
            }
            int cst = 0;
            while (cst<nst) {
                System.out.print("* ");
                cst++;                
            }
            System.out.println();
            nsp++;
            nst--;
            row++;
        }
    }
}
