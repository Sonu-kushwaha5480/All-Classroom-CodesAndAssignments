public class ReversePrint {
    //I will have to print 1 to 5 after passing 5
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n) {
        // int sum=0;
        // sum= sum+n;
        if(n==0){
            return;
        }
        // for(int i=1;i<n; i++){
        //     print(i);
        // }
        print(n-1);
        System.out.println(n);
    }
}
