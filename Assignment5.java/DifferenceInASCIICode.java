import java.util.Scanner;

public class DifferenceInASCIICode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(InsertDiff(s));
    }
    public static String InsertDiff(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder result= new StringBuilder();
        // char currentchar= s.charAt(0);
        for(int i=1; i<s.length(); i++){
            int Diff= (int) s.charAt(i)- (int) s.charAt(i-1);
            result.append(s.charAt(i-1)).append(Diff);
            if (i==s.length()-1) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
