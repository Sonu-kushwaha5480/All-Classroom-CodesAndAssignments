import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows N: ");
            int n = sc.nextInt();  // Number of rows

            int row = 0;
            while (row < n) {
                int val = 1;
                int cst = 0;
                while (cst <= row) {
                    System.out.print(val + " ");
                    val = val * (row - cst) / (cst + 1);
                    cst++;
                }
                System.out.println();
                row++;
            }
    }
}
