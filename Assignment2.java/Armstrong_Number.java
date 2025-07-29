import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long sum=0;
        long n=sc.nextLong();
        long  m=n;
        long k=n;
        boolean b= false;
        int NoOfDigit=0;
        while(n>0){
            
            while (m>0) {
                NoOfDigit++;
                m=m/10;
            }
            long digit= n%10;
            sum= sum + (long)(Math.pow(digit, NoOfDigit));
            n=n/10;
            
        }        
        if (sum==k) {
            b =true;
        }
        System.out.println(b);        
    }
}
