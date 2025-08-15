public class OpeningClosingParenthesis {
    public static void main(String[] args) {
        int n=3;
        validparenthesis(n,0,0,"");
    }
    public static void validparenthesis(int n, int op, int cl, String ans) {
        if (op>n) {
            return;
        }
        if (op==n&& cl==n) {
            System.out.println(ans);
            return;
        }
        validparenthesis(n, op+1, cl, ans +"(");
        if (op>cl) {
            validparenthesis(n, op, cl+1, ans +")");
        }
    }
}
