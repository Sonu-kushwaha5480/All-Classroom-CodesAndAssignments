import java.util.Scanner;

public class RemoveConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compress(s));
    }
    public static String compress(String str) {
        if (str.isEmpty()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                // count++;
            } else {
                result.append(currentChar);
                currentChar = str.charAt(i);
                // count = 1;
            }
        }
        result.append(currentChar);
        return result.toString();
    }
}
