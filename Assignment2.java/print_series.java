import java.util.Scanner;

public class print_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int count = 0;
        int n = 1;
        while (count < N1) {
            int series = 3 * n + 2;
            if (series % N2 != 0) {
                System.out.println(series);
                count++;
            }
            n++;
        }
    }
}
