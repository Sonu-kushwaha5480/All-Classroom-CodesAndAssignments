import java.util.Scanner;

public class Simple_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        while (true) {
            long n=sc.nextLong();
            
            sum= sum + n;
            if (sum<0) {
                break;
            }
            System.out.println(n);
            }      
        }
}
