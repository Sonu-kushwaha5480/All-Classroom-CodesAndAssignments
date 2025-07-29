public class Fabanocci {
    public static void main(String[] args) {
        int n=5;
        int ans= fibo(5);
        System.out.println(ans);
    }
    public static int fibo(int n) {
        if (n==1||n==2) {
            return 1;
        }
        int f1=fibo(n-1);
        int f2=fibo(n-2);        
        return f1+f2;
    }
}
