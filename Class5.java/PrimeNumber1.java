import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            if (n%i==0) {
                System.out.print(i + "is no a prime number");
            }
            else{
                System.out.print(i + "is a prime number");
            }
            System.out.println();
        }
    }
}
