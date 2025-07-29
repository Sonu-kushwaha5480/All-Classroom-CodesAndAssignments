import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row: ");
        int n = sc.nextInt();
        // System.out.println("Enter number of Columns: ");
        // int m = sc.nextInt();
        int row=1;
        
        while (row<=n) {
            int col=1;
            while (col<=n) {
                if (row==col) {
                System.out.print("* ");                
            }
            else if (row+col==n+1) {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
            col++;
            }
            System.out.println();
            row++;
        }
        System.out.println(row);
    }
}
