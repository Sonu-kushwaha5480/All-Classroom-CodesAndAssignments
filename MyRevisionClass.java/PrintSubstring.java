public class PrintSubstring {
    public static void main(String[] args) {
        String s= "abcd";
        substring(s);

    }
    public static void substring(String s) {
        for(int i=0;i<s.length(); i++){
            for(int j=i+1;j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
