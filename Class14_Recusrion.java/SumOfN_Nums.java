public class SumOfN_Nums {
    public static void main(String[] args) {
        int n=10;
        // sum(n);
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n==1) {
            return 1;
        }
        int sum_of_nMinusOne=sum(n-1);
        return sum_of_nMinusOne + n;
    }
}
