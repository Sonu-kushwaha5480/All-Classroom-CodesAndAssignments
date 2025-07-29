import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n - 1;
        int row = 1;

        while (row <= 2 * n - 1) {           
            int csp = 0;
            while (csp < nsp) {
                System.out.print("  ");
                csp++;
            }
            int val;            
            //int num = val;
            if (row<=n) {
                val = row ;
            }
            else{
                val = 2 * n - row;
            }
            int cst = 0;
            while (cst < nst) {
                System.out.print(val + " ");
                if (cst < nst / 2) {
                    val++;
                } else {
                    val--;
                }
                cst++;
            }

            // Update spacing and stars for next row
            if (row < n) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }

            System.out.println();
            row++;
        }
    }
}
