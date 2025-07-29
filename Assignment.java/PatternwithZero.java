import java.util.Scanner;

public class PatternwithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row =1;

        while (row<=n) {
            int cst=0;
            while (cst<nst) {
                if (cst==0||cst==row-1) {
                    System.out.print(row+ " ");
                }
                else{
                    System.out.print("0 ");
                }
                cst++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}
