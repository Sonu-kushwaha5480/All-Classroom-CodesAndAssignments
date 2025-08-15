public class AllPermutationOfString {
    public static void main(String[] args) {
        String s="abc";
        rec(s, "");
    }
    public static void rec(String ques, String ans) {
        if (ques.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<ques.length();i++){
            char ch = ques.charAt(i);
            String left= ques.substring(0,i);
            String right= ques.substring(i+1);
            rec(left+right, ans+ch);
        }
    }
}
