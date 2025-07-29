public class Power {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int ans= pow(a, b);
        System.out.println(ans);
    }
    public static int pow(int a, int b) {
        if (b==1) {
            return 3;
        }
        int pow_of_nMinusOne= pow(a, b-1) ;
        return pow_of_nMinusOne *a;
    }
}
