import java.util.Scanner;
// long java.util.Scanner.nextLong();

public class Replace_All_Zero_With_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n == 0){
            System.out.println(5);
        }
        else{
        long sum=0;
        long position=1;
        while (n>0) {
            long mul=(long)(Math.pow(10, position-1));
            long digit=n%10;
            if (digit==0) {
                digit=5;
            }
            sum= sum + digit * mul;
            position++;
            n=n/10;
        }
        System.out.println(sum);
        }
    }
}
