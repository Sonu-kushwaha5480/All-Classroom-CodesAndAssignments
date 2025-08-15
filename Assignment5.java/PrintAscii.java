import java.util.Scanner;

public class PrintAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nCharacter\tASCII Code");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch; // get ASCII value
            System.out.println(ch + "\t\t" + ascii);
        }
    }
}
