import java.util.Scanner;

public class Fohrenheit_To_Celcius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int minf=sc.nextInt();
        int maxf=sc.nextInt();
        int step = sc.nextInt();
        while (minf <= maxf) {
            int celsius = (int)(((float)(5.0/ 9))* (minf - 32));  // Correct formula
            System.out.println(minf + "\t" + celsius);     // Tab-separated output
            minf += step;
        }
    }
}
