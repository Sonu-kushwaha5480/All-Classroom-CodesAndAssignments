import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int row = 1;
        while (row<=n) {
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
        }
    }
}
