import java.util.Scanner;

public class ern_MountainGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input number of rows
        int nst1 = 1;  // Initial number of stars for the first part (left part)
        int nst2 = 1;  // Initial number of stars for the second part (right part)
        int nsp = 2 * n - 1;  // Spaces between the left and right parts
        int row = 1;

        // Loop through rows
        while (row <= n) {
            // Left side: print increasing numbers
            int val1 = 1;
            int cst1 = 0;
            if (row==n) {
                cst1++;
            }
            while (cst1 < nst1) {
                System.out.print(val1 + " ");
                val1++;
                cst1++;
            }

            // Spaces in between
            int csp = 0;
            while (csp < nsp) {
                System.out.print("  ");
                csp++;
            }

            // Right side: print decreasing numbers
            int val2 = row;
            int cst2 = 1;
            while (cst2 <= nst2) {
                System.out.print(val2 + " ");
                val2--;
                cst2++;
            }

            // Move to the next row
            System.out.println();
            row++;
            nst1++;  // Increase left-side numbers
            nst2++;  // Increase right-side numbers
            nsp -= 2;  // Decrease spaces as we go down
        }
    }
}

