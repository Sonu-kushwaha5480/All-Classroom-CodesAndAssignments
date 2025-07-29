import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.print("a is greatest");
            
        }
        else if (b>c) {
            System.out.println("b is the greatest");
            
        }
        else{
            System.out.println("c is the greatest");
        }

    }
}
