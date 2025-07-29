//Function calling itself.
//It's basically a way of solving problem.
//We always look problem in small recurring sub problem.

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;
        print(n);
    }
    public static void print(int n) {//It will print 5 to 4
        // int sum=0;
        // sum= sum+n;
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
