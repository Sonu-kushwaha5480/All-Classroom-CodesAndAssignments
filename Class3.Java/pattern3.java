import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        while (row<=n) {
            int cst =0;
            while (cst<nst) {
                System.out.print("* ");
                cst++;
            
            }
            System.out.println();
            nst--;
            row++;
            
        }
    }
}
