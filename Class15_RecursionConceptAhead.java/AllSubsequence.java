import java.util.Scanner;

public class AllSubsequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        subsequence(s,"");
    }
    public static void subsequence(String s, String ans) {
        if (s.length()==0) {
            System.out.println(ans);
            return;
        }        
        char ch= s.charAt(0);
        subsequence(s.substring(1), ans);
        subsequence(s.substring(1), ans+ch);
        // subsequence(s.substring(1), ans);
    }
}

