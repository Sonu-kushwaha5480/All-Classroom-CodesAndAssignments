import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul =0;
		while(n>0) {
			int digit = n%10;
			sum = sum+digit * (int)(Math.pow(2, mul));
			mul++;
			n = n/10;
		}
		
		System.out.println(sum);
    }
}
