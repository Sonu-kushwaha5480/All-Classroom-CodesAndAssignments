import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int n= sc.nextInt();
        int nst=n;
        int row=1;
        while (row<=n) {
            int cst=0;
            while (cst<nst) {
                int col=1;
                if (row==col || row+col==n+1) {
                System.out.print("* "); 
                }
                else{
                    System.out.print("  ");
                } 
                col++;               
                cst++;                
            }
            System.out.println();
            row++;            
        }
    }
}
