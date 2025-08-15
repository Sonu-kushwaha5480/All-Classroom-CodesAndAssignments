import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        StringBuilder result= new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch= Character.toUpperCase(ch);
                result.append(ch);
            }else{
                ch= Character.toLowerCase(ch);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
