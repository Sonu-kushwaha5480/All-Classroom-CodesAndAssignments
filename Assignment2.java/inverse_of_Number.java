import java.util.Scanner;

public class inverse_of_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n=32145;
        int n=sc.nextInt();
        int sum=0;
        int place=1;
        while (n>0) {
            int digit=n%10;
            sum = sum + place * (int)(Math.pow(10, digit-1));
            place++;
            n=n/10;
        }
        System.out.print(sum);
    }
}
