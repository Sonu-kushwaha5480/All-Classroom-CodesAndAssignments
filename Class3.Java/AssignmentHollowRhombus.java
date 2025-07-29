import java.util.Scanner;
public class AssignmentHollowRhombus {
    public static void main(String[] args) {
        System.out.println("Enter the number of Rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int row = 1;
        int nsp = n-1;
        while (row<=n) {
            int csp=0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst =1;
            while (cst<=nst) {
                if (row==1||row==n||cst==1||cst==nst) {
                    System.out.print("* ");
                }
                else{System.out.print("  ");}
                
                cst++;                
            }
            System.out.println();
            row++;
            nsp--;           
        }
    }

}