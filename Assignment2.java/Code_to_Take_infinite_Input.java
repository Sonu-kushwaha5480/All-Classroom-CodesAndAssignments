import java.util.Scanner;

public class Code_to_Take_infinite_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long n=sc.nextLong();
            long sum=0;
            sum= sum + n;
            if (sum<0) {
                break;
            }
            System.out.println(n);
            }      
        }
    }
