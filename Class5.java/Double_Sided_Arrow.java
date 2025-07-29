import java.util.Scanner;

public class Double_Sided_Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst1=1; int nst2=1; int nsp1=n-1; int nsp2=-1;               
        int row=1;
        int mid = (n/2);
        // if (n%2==0){
        //     mid = (n/2);
        // }
        // else {
        //     mid = (n/2);
        // }
        // 
        int val1 = 0;
        while (row<=n) {
            int csp1=0;
            while (csp1<nsp1) {
                System.out.print("  ");
                csp1++;
            }
            if (row<=mid) {
                val1=row;
            }
            else{
                // System.out.print(mid);
                val1= mid + 1;
                mid -= 1;
            }
            int cst1=0;
            // int val1 = 1;
            while (cst1<nst1) {
                System.out.print(val1 + " ");
                cst1++;
                val1--;
            }
            int csp2=0;
            while (csp2<nsp2) {
                System.out.print("  ");
                csp2++;
            }
            int val2=1;
            int cst2=0;
            if (row==1) {
                
            }
            if (row==1 || row==n) {
                cst2++;
            }
            while (cst2<nst2) {
                System.out.print(val2 +  " ");
                cst2++;
                val2++;
            }
            if (row<(n/2)+1) {
                nst1++;
                nsp1-=2;
                nsp2+=2;
                nst2++;
            }
            else{
                nst1--;
                nsp1+=2;
                nsp2-=2;
                nst2--;
            }
            System.out.println();
            row++;
        }
    }
}
