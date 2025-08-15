import java.util.Scanner;

public class Strings_StringCompression {
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
                count++;
            } else {
                if (count==1) {
                    result.append(currentChar);
                }else{
                    result.append(currentChar).append(count);
                }
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        if (count==1) {
            result.append(currentChar);
        }else{
            result.append(currentChar).append(count);
        }
        return result.toString();
    }
}
