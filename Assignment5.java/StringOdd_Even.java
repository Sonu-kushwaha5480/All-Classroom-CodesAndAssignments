import java.util.Scanner;

public class StringOdd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(replace(s));
    }
    public static String replace(String str) {
        if (str.isEmpty()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i%2==0) {
                int ASCII=(int) str.charAt(i);
                int IntegerAhead= ASCII+1;
                result.append((char) IntegerAhead);
            } else {
                int ASCII=(int) str.charAt(i);
                int LowerInteger= ASCII-1;
                result.append((char) LowerInteger);
            }
        }
        // result.append(currentChar);
        return result.toString();
    }
}
