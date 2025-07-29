import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        boolean b= true;
        for(int i=2; i<N; i++){
            if (N%i==0) {
                b=false;
                break;
            }
            i++;            
        }
        if (b==true) {
                System.out.print("Prime");
            }
            else{
                System.out.print("Not Prime");
            }
    }
}
