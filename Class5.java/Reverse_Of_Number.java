import java.util.Scanner;

public class Reverse_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int sum=0;
        int reverse=0;
        while (n>0) {
            int digit = n%10;
            //sum = sum+digit;
            reverse = reverse*10 + digit;
            n=n/10;
        }
        System.out.println(reverse);
            
        }
}
