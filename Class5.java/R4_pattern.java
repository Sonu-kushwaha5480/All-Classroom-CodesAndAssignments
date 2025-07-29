import java.util.Scanner;

public class R4_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row number N: ");
        int N= sc.nextInt();
        int nst = 1;
        int row=1;
        while (row<=2*N-1) {
            if (row%2!=0) {
            int cst =0;
            while (cst<nst) {
                System.out.print("*");  
                cst++;              
            }
        }
            else{
                System.out.print("");
            }
            System.out.println();
            row++;
            if (row%2!=0) {
            nst++;
            }
        }
    }
}
