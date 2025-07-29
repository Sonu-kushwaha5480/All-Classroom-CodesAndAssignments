import java.util.Scanner;

public class PatternMagic {
    public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int nst1 = n;
		int nst2 = n;
		int row =1;
		int nsp  = -1;
		
		while(row<=2*n-1) {
			int cst1 =0;
			while(cst1<nst1) {
				System.out.print("* ");
				cst1++;
			}
			int csp =0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2 =0;
			if(row ==1 || row==2*n-1) {
				cst2++;
			}
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			if(row< n) {
				nst1--;
				nst2--;
				nsp+=2;
			}
			else {
				nst1++;
				nst2++;
				nsp-=2;
			}
			System.out.println();
			row++;
		}
		
    }
}
