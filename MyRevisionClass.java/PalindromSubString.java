import java.util.Scanner;

public class PalindromSubString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        substring(s);

    }
    public static void substring(String s) {
        int count=0;
        int ans=0;
        for(int i=0;i<s.length(); i++){
            for(int j=i+1;j<=s.length(); j++){
                if (Ispalindrome(s.substring(i,j))) {
                    // System.out.println(s.substring(i,j));
                    count++;
                }
            }
        }
        ans=Math.max(ans, count);
        System.out.println(ans);
    }
    public static boolean Ispalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
