import java.util.Scanner;

public class print1to20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n = sc.nextInt();
        while (i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
