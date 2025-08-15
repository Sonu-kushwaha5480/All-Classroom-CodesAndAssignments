public class Subsring_In_ascending {
    public static void main(String[] args) {
        String s= "abcd";    
        substring(s);       

    }
    public static void substring(String s) {
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<=s.length()-i; j++){
                System.out.println(s.substring(j,j+i));
            }
        }
    }
}
