import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n/2;
        int row = 1;
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
            if (row<(n/2) +1) {
                nst +=2;
                nsp--;
            }
            else{
                nst -=2;
                nsp++;
            }
            System.out.println();
            row++;
        }
    }
}
