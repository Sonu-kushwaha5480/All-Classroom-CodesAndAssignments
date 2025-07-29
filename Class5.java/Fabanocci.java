import java.util.Scanner;

public class Fabanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        
        int row=1;
        // System.out.print(a + " ");
        // System.out.print(b + " ");
            while (row<=n) {
                int i=1;
                while (i<=row) {
                    System.out.print(a+ " ");
                    int c= a +b;
                    a=b;
                    b=c;            
                    i++;    
                }
                System.out.println();
                row++;
            }        
    }
}
