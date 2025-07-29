public class FactorialViaRecursion {
    public static void main(String[] args) {
        int n=5;
        // fact(n);
        System.out.println(fact(n));
    }
    public static int fact(int n) {
        if (n==1) {
            return 1;
        }
        int fact_of_nMinusOne=fact(n-1);
        return fact_of_nMinusOne *n;
    }
}
