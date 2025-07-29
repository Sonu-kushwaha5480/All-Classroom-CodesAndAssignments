import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n-1;
        int row=1;
        int nst
        while (row<=n) {
            int csp=0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;                
            }
            int cst=0;
            while (cst<nst) {
                if (cst%2==0) {
                    System.out.print("* ");                    
                }
                else{System.out.print("! ");} 
                cst++;               
            }
            nsp--;
            nst+=2;
            row++;
            System.out.println();

            
        }
    }
}
