import java.util.Scanner;

public class Any_To_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        int sn=sc.nextInt();
        int a=BaseToDecimal(sn,sb);
        int b=DecimalToBinary(a,db);
        System.out.println(b);

    }
    public static int BaseToDecimal(int num, int sb) {
		int sum = 0;
		int mul =1;
		while(num>0) {
			int digit = num%10;
			sum = sum+digit*mul;
			mul = mul *sb;
			num = num/10;
		}
        return sum;
    }
    public static int DecimalToBinary(int n, int db) {
		int sum = 0;
		int mul =1;
		while(n>0) {
			int digit = n%db;
			sum = sum+digit*mul;
			mul = mul *10;
			n = n/db;
		}
        return sum;
    }
}
