import java.util.Scanner;

public class CanYouRead {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        for(int i=0; i<s.length(); i++){
            // char ch = s.charAt(i);
            if (i != 0 && Character.isUpperCase(s.charAt(i))) {
                System.out.println();
            }
            System.out.print(s.charAt(i));
        }
    }
}
