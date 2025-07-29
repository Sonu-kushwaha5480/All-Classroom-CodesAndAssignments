/* problem below
 * * * * *
      * * * *
          * * *
              * *
                  *                   
    problem Above              */

import java.util.Scanner;

public class PatternQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nsp=0; // Number of spaces
        int nst=n; // number of stars
        int row=1;
        while (row<=n) {
            int csp=0;  // csp shows count of spaces
            while (csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst=0;  // cst is count of stars
        while (cst<nst) {
            System.out.print("* ");
            cst++;
        }
        nst--;
        System.out.println();
        row++;
        nsp+=2;
        }
    }
}
