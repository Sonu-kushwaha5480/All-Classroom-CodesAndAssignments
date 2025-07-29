import java.util.Scanner;

public class Chewbacca_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul =0;
        // int k=n;
        int count=0;
        int noOfDigit=0;
        // while (k>0) {
        //     count++;
        //     noOfDigit++;
        //     k=k/10;
        //     }

        while(n>0) {
			int digit = n%10;
            if (n/10==0 && digit==9) {
                digit= digit;
            }
            else if (digit>9-digit) {
                digit=9-digit;
            }
			sum = sum+digit * (int)(Math.pow(10, mul));
			mul++;
			n = n/10;
		}
		
		System.out.println(sum);
    }
}
