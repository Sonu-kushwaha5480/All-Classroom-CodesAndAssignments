public class StringReverse {
    public static void main(String[] args) {
        String s="abcd";
        reverse(s);
        for(int i=0; i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        
    }
    public static String reverse(String s) {
        String temp="";
        for(int i=s.length()-1; i>=0;i--){
            temp +=s.charAt(i);
        }
        return temp;
    }
}
