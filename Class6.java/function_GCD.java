import java.util.Scanner;

public class function_GCD {
    public static void main(String[] args) {
        
    }
    public static int  function_GCD(int a , int b){
    Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		
		while(dividend%divisor > 0) {
			int r = dividend%divisor ;
			dividend = divisor;
			divisor =r;
		}
		
		System.out.println(divisor);
    }
}
