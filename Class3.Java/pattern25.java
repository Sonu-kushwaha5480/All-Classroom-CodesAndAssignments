import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        
        int numberofspace = row-1;
        int currentrow = 1;
        int ns1=1;
        int a=1;
        while (currentrow <= row) {
            
            int countofspace = 0;
            while (countofspace < numberofspace) {
                System.out.print("    ");
                countofspace++;                
            }
            int countofnumber = 0;    
            while (countofnumber < ns1) {
                System.out.print(a + "   ");
            countofnumber++;
            a++;
        }
        ns1 += 2;
        numberofspace--;
        currentrow++;
        System.out.println();
        }
    }
}
