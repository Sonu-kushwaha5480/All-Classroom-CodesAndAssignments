import java.util.Scanner;

public class NumberLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int i = 1;
        while (row<=n) {
            int cst = 0;
            while (cst<nst) {
                int val=i;
                System.out.print(val +" ");
                cst++;
                i++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
