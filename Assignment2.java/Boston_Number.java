import java.util.Scanner;

public class Boston_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum=0;
        long sum1=0;
        long k=n;
        while (k>0) {
            long digit=k%10;
            sum1=sum1+digit;
            k=k/10;
        }
        while (n%2==0) {
            sum = sum +2;
            n=n/2;
        }
        for(long i=3; i<=Math.sqrt(n);i+=2){
            while (n%i==0) {
                
                sum=sum +digitSum(i);
                n=n/i;              
            }
        }
        if (n>2) {
            sum= sum +digitSum(n);
        }
        if (sum1==sum) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        System.out.println(sum);
        System.out.println(sum1);
    }

    public static int digitSum(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
