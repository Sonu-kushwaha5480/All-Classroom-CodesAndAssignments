import java.util.Scanner;

public class Good_Substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        int ans=0;
        for(int i=0; i<s.length();i++){
            if (vowel(s.charAt(i))) {
                count++;
            }else{
                ans=Math.max(ans, count);
                count=0;
            }
        }
        ans=Math.max(ans, count);
        System.out.println(ans);
    }
    public static boolean vowel(char ch) {
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            return true;
        }
        return false;
    }
    
}
