import java.util.Scanner;

public class Print_Armstrong_Number_In_Range {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);        
        long N1=sc.nextLong();
        long N2=sc.nextLong();
        long k=0;
        long i=N1;
        while (i<N2) {
        long iter=i;
        long sum=0;
        long  m=i;
        k=i;
        // boolean b= false;
        int NoOfDigit=0;
        while (m>0) {
                NoOfDigit++;
                m=m/10;
            }
            while(iter>0){
            long digit= iter%10;
            sum= sum + (long)(Math.pow(digit, NoOfDigit));
            iter=iter/10;
            
        }
        if (sum==k) {
            System.out.print(k +" ");
        }
        i++;
        }        
        
    }
}
