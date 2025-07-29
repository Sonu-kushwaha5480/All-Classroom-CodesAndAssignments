import java.util.Scanner;

public class SumOfOddAndEvenPlaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum1=0;
        int sum2=0;
        int position=1;
        while (n>0) {
            int digit=n%10;
            if (position%2==0) {
                sum1= sum1 + digit;
            }
            else{
                sum2 = sum2 + digit;
            }
            n=n/10;
            position++;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
