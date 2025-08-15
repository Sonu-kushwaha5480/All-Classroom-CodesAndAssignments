public class DiceRole {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        // int current=0;
        roll(0,n,"");
    }
    public static void roll(int current, int n, String ans) {
        if (current>n) {
            return;
        }
        if (current==n) {
            System.out.println(ans);
            return;
        }
        roll(current+1, n, ans+1);
        roll(current+2, n, ans+2);
        roll(current+3, n, ans+3);
    }
}
