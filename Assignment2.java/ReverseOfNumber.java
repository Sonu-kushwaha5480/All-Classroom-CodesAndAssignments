import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            int digit=n%10;
            sum = sum*10 + digit;
            n=n/10;
        }
        System.out.print(sum);
    }
}
