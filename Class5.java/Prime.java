import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
        if (n%1==0 && n%n==0) {
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
        }
    }
}
