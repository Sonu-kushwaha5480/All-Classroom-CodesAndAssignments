import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N= sc.nextLong();
        while (N-->0) {
            // int position=1;
            long CarNo=sc.nextLong();
            long sumOdd=0;
            long sumEven=0;
            while (CarNo>0) {
                long digit= CarNo%10;
                if (digit%2==0) {
                    sumEven= sumEven + digit;
                }
                else{
                    sumOdd= sumOdd + digit;
                }
                CarNo=CarNo/10;
                // position++;
            }
            if (sumEven%4==0 || sumOdd%3==0) {
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }
        }
        // System.out.println();
    }
}
