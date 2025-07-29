import java.util.Scanner;

public class Inverted_Glass_Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nst1=1;
        int nst2=1;
        int nsp=2*n-1;
        int row=1;
        int mid=n+1;
        int inc2=n;
        int val2=0;
        while (row<=2*n+1) {
            int val1=n;
            int cst1=0;
            if (row==n+1) {
                cst1++;
            }
            while (cst1<nst1) {
                System.out.print(val1 +" ");
                val1--;
                cst1++;
            }
            int csp=0;
            while (csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            if (row<=mid) {
                val2=inc2;
                inc2--;
            }
            else{
                inc2+=1;
                val2=inc2+1;
                // inc2+=1;
            }
            int cst2=0;
            while (cst2<nst2) {
                System.out.print(val2 +" ");
                val2++;
                cst2++;
            }
            if (row<n+1) {
                nst1++;
                nst2++;
                nsp-=2;
            }
            else{
                nst1--;
                nst2--;
                nsp+=2;
            }
        System.out.println();
        row++;
        }
    }
}
